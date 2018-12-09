repositories.remote << 'http://repo1.maven.org/maven2'

define 'alumi-quality.api' do
  project.version = '0.1.0'
  project.group = 'alumi-quality'
  package :jar
end
