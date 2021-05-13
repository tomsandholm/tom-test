// vi:set nu ai ap aw smd showmatch tabstop=4 shiftwidth=4:

pipeline {
	agent any
	parameters {
		string (
			description: 'Tag Override Value',
			name: 'tagovr',
			defaultValue: 'auto'
		)
	}


	stages {
		stage('demo') {
			steps {
				script {
					if ( params.tagovr != 'auto' ) {
						sh 'echo it is not auto'
					} else {
					    TAGSTRING = params.tagovr
						sh 'echo it is auto'
						sh 'echo the value is TAGSTRING'
					}
				}
			}
		}
	}
}
