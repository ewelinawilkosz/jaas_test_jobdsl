job('testjob-1') {
	scm {
		github 'ewelinawilkosz2/jaas_test'
	}
	triggers {
		cron('*/5 * * * *')
	}
	steps {
		shell('echo Hello!')
		shell(readFileFromWorkspace('testjob-1', 'checkDate.py'))
	}
	logRotator {
		numToKeep(5)
		artifactNumToKeep(1)
	}
}