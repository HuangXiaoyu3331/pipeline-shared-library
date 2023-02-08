package com.huangxy

def call(Closure body) {
    node('Linux') {
        body()
    }
}