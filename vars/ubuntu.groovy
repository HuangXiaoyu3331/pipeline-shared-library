def call(Closure body) {
    node('ubuntu') {
        body()
    }
}