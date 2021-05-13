
pipeline {
	agent any
	parameters {
		string (
			description: 'Tag Override Value',
			name: tagovr,
			defaultValue:
		)
	}


	stages {
		stage('demo') {
			steps {
				if ( params.tagovr != null ) {
					echo 'it is not null'
				} else {
					echo 'it is null'
				}
			}
                }
	}
}
