@Library('tom-lib')_

properties([
    parameters([
        [
            $class: 'ChoiceParamter',
            choiceType: 'PT_SINGLE_SELECT',
            description: '',
            filterable: false,
            name: 'Tag',
            randomName: 'choice-parameter-21337077649621572',
            script: [
                $class: 'GroovyScript',
                fallbackScript: '',
                script: '''
	            def sout = new StringBuffer(), serr = new StringBuffer()
	            def list = '/usr/bin/git tag'.execute()
	            list.consumeProcessOutput(sout,serr)
	            list.waitForOrKill(10000)
	            return list.tokenize()
            ]
        ]
    ])
])

pipeline {
	agent any
	parameters {
		choice(name: 'Tag:', choices: list)
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
