@Library('tom-lib')_

def getArray() {
  return ['one','two','three']
}

pipeline {
	agent any
        environment {
            sel=getArray()
        }
        parameters {
            choice(name: 'Choice', choices: [getArray()] , description: 'Pick somethine')
        }
	stages {
		stage('demo') {
			steps {
				helloWorld 'hi everyone'
				helloTom 'this is for tom'
				helloKat 'this is for kat'
			}
		}
	}
}
