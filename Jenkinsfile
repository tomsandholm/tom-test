@Library('tom-lib')_

def findTags() {
	def sout = new StringBuffer(), serr = new StringBuffer()
	def list = '/usr/bin/git tag'.execute()
	list.consumeProcessOutput(sout,serr)
	list.waitForOrKill(10000)
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
