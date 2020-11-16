@Library('tom-lib')_

pipeline {
	agent any
	parameters {
		activeChoiceParam('choice1') {
			description('select your choice')
			choiceType('RADIO')
			groovyScript {
				script("return['aaa','bbb']")
				fallbackScript('return["error"]')
			}
		}
	}
	stages {
		stage('demo') {
			steps {
				helloWorld 'hi everyone'
				helloTom 'this is for tom'
				helloKat 'this is for kat'
			}
                }
                stage('deploy') {
                       when { tag "official-release-*" }
                       steps {
                                echo 'deploy mode activated'
                       }
		}
	}
}
