package com.huangxy

def call(Closure body) {
    node('linux') {
        body()
    }
}