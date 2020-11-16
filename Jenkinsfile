@Library('tom-lib')_

def findTags() {
	def list = '/usr/bin/git tags'.execute()
	return list.tokenize()
}

def List = findTags().join('\n')

pipeline {
	agent any
	parameters {
		choice(name: 'Tag:', choices: List)
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
