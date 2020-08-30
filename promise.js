function MyPromise(action) {
    this.callbacks = [];
    this.onCatch;
    action(this.resolve.bind(this), this.reject.bind(this));
}

MyPromise.prototype.resolve = function (value) {
    try {
        var callback = this.callbacks.pop();
        var result = callback(value);
        if (!result) return;

        if (result instanceof MyPromise) {
            var resolve = this.resolve.bind(this);
            return result.then(function (d) {
                return resolve(d);
            });
        }
        return this.resolve(result);
    } catch (ex) {
        this.onCatch(ex)
    }
}

MyPromise.prototype.reject = function (reason) {
    return new Promise((resolve, reject) => {
        reject(reason)
    })
}

MyPromise.prototype.then = function(callback) {
    this.callbacks.unshift(callback);
    return this;
}

MyPromise.prototype.catch = function(fail) {
    this.onCatch = fail
    return this;
}
// 1
// 2
// "received an error"
const promise = new MyPromise((resolve, reject) => {
    setTimeout(() => {
      resolve(1);
    }, 1000);
})

promise
.then((res) => {
  console.log(res)
  return res + 1
})
.then((res) => {
  console.log(res)
  throw new Error('something is wrong')
})
.catch(error => {
  console.log('received an error')
})

