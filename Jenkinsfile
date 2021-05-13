// vi:set nu ai ap aw smd showmatch tabstop=4 shiftwidth=4:

pipeline {
	agent any
	parameters {
		string (
			description: 'Tag Override Value',
			name: 'Tag-Override-Value',
			defaultValue: ''
		)
	}


	stages {
		stage('demo') {
			steps {
				script {
					if ( params.Tag-Override-Value != '' ) {
						sh 'echo it is not auto'
						sh 'echo the value is ${Tag-Override-Value}'
					} else {
						sh 'echo it is auto'
					}
				}
			}
		}
	}
}
