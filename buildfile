repositories.remote << 'http://repo1.maven.org/maven2'

require 'buildr/gpg'
require 'buildr/custom_pom'

THIS_VERSION = '0.1.0'

define 'alumi-quality.api' do
  project.version = '0.1.0'
  project.group = 'com.alumisky'
  
  pom.add_apache_v2_license
  pom.add_github_project('renatgilmanov/search-quality.api')
  pom.add_developer('rgilmanov', 'Renat Gilmanov')
  
  package :jar
  package(:sources)
  package(:javadoc)

end
