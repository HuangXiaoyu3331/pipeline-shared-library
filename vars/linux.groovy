package com.huangxy

def call(Closure body) {
    ndoe('Linux') {
        body()
    }
}