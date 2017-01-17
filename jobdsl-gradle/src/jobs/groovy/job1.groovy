job('testjob-1') {
	scm {
		github 'ewelinawilkosz2/jaas_test'
	}
	triggers {
		cron('*/5 * * * *')
	}
	steps {
		shell('echo Hello!')
	}
}