/* vi:set nu ai ap aw smd showmatch tabstop=4 shiftwidth=4: */
pipeline {
  agent any
  environment {
    rootdisk = 'firmware-param-1'
    FW_PARAM2 = 'firmware-param-2'
  }
  parameters {
    choice(choices: '1G\n2G\n4G', description: 'Root Disk Size', name: 'rootdisk')
	choice(choices: '18.04\n20.04', description: 'Distro', name: 'distro')
	choice(choices: 'general\njenkins\njenkinsslave', description: 'Role', name: 'role')
    choice(choices: 'test\ndev\nstage\nprod', description: 'Build Type:', name: "Type")
	booleanParam(name: 'Publish', defaultValue: false, description: 'Push to Artifactory?')
  }
  stages {
    stage('Build') {
      steps {
        echo "${params.rootdisk}"
        echo "${params.distro}"
        echo "${params.role}"
        echo "${params.Type}"
      }
    }
  }
}
