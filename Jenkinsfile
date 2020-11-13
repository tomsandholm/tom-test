@Library('tom-lib')_

def findOptions() {
  return sh (script: 'git tag .', returnStdout: true ).trim()
}

def getArray() {
  return ['1','2','3','4','5']
}

pipeline {
	agent any
        environment {
            sel=findOptions()
        }
        parameters {
            choice(name: 'Choice', choices: findOptions() , description: 'Pick a Tag')
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
