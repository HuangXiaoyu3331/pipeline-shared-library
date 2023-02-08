package com.huangxy

class Utilities implements Serializable {
    def steps
    Utilities(steps) {
        this.steps = steps
    }

    def sh() {
        steps.sh "echo hello world"
    }
}