# vi:set nu ai ap aw smd showmatch tabstop=4 shiftwidth=4:

pipeline {
	agent any
	parameters {
		string (
			description: 'Tag Override Value',
			name: tagovr,
			defaultValue: ''
		)
	}


	stages {
		stage('demo') {
			steps {
				script {
					if ( params.tagovr != null ) {
						sh 'echo it is not null'
					} else {
						sh 'echo it is null'
					}
				}
			}
		}
	}
}
