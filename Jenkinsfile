/* vi:set nu ai ap aw smd showmatch tabstop=4 shiftwidth=4: */
pipeline {
  agent any
  environment {
    FW_PARAM1 = 'firmware-param-1'
    FW_PARAM2 = 'firmware-param-2'
  }
  parameters {
    choice(choices: 'test\ndev\nstage\nprod', description: 'Build Type:', name: "Type")
  }
  stages {
    stage('Build') {
      steps {
        echo "${params.Type}"
      }
    }
  }
}
