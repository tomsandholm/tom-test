// vi:set nu ai ap aw smd showmatch tabstop=4 shiftwidth=4:

pipeline {
	agent any
	parameters {
		string (
			description: 'Tag Override Value',
			name: 'tagovr',
			defaultValue: ''
		)
	}


	stages {
		stage('demo') {
			steps {
				script {
					if ( params.tagovr != '' ) {
					    TAGSTRING = ${params.tagovr}
						sh 'echo it is not auto'
						sh 'echo the value is ${params.tagovr}'
					} else {
						sh 'echo it is auto'
					}
				}
			}
		}
	}
}
