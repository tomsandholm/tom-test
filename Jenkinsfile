@Library('tom-lib')_

pipeline {
	agent any
        environment {
            def sel = new String[3]
            def sel[0] = 'one'
            def sel[1] = 'two'
            def sel[2] = 'three'
        }
        parameters {
            choice(name: 'Choice', choices: ${sel} , description: 'Pick somethine')
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
