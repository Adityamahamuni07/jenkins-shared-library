def call() {
    echo 'Starting Maven Build...'

    sh 'mvn -B clean package'

    echo 'Maven Build Completed!'
}
