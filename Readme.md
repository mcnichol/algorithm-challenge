


### Links
* https://cloud.google.com/compute/docs/gcloud-compute


### Commands
`gcloud help`

`gcloud info`

`gcloud info`
- gcloud displays a summary of information about your Cloud SDK installation. This includes information about your system, the installed SDK components, the active user account and current project, and the properties in the active SDK configuration.

`gcloud config`
- Change more **gcloud** settings
 
`gcloud config list` 
- List Settings

`gcloud config set compute/zone [ZONE]`
- Sets the default zone to one of the [Compute Engine Zones](https://cloud.google.com/compute/docs/zones#available)

`gcloud auth list`
- Displays a list of credentialed accounts

`gcloud components install [COMPONENT]`
- Installs components at the current version of your Cloud SDK installation

### Google Cloud SDK Components

|                    Name                              |             ID           |    Size   |
|------------------------------------------------------|--------------------------|-----------|
| App Engine Go Extensions                             | app-engine-go            |  47.7 MiB | 
| Bigtable Command Line Tool                           | cbt                      |   3.9 MiB | 
| Cloud Datalab Command Line Tool                      | datalab                  |   < 1 MiB | 
| Cloud Datastore Emulator                             | cloud-datastore-emulator |  15.4 MiB | 
| Cloud Datastore Emulator (Legacy)                    | gcd-emulator             |  38.1 MiB | 
| Cloud Pub/Sub Emulator                               | pubsub-emulator          |  21.0 MiB | 
| Emulator Reverse Proxy                               | emulator-reverse-proxy   |  55.7 MiB | 
| Google Container Registry's Docker credential helper | docker-credential-gcr    |   3.4 MiB | 
| gcloud Alpha Commands                                | alpha                    |   < 1 MiB | 
| gcloud Beta Commands                                 | beta                     |   < 1 MiB | 
| gcloud app Java Extensions                           | app-engine-java          | 128.6 MiB | 
| gcloud app PHP Extensions (Mac OS X)                 | app-engine-php-darwin    |  21.9 MiB | 
| gcloud app Python Extensions                         | app-engine-python        |   6.1 MiB | 
| kubectl                                              | kubectl                  |  14.8 MiB | 
| BigQuery Command Line Tool                           | bq                       |   < 1 MiB | 
| Cloud SDK Core Libraries                             | core                     |   5.8 MiB | 
| Cloud Storage Command Line Tool                      | gsutil                   |   2.9 MiB | 
| Default set of gcloud commands                       | gcloud                   |     -     |


Steps for Setup:

*
*
*
*

### FAQ

Error: 
`ResponseError: code=403, message=Google Compute Engine: Access Not Configured. Compute Engine API has not been used in project ${PROJECT_ID} before or it is disabled. Enable it by visiting https://console.developers.google.com/apis/api/compute_component/overview?project=${PROJECT_ID} then retry. If you enabled this API recently, wait a few minutes for the action to propagate to our systems and retry.`
Solution: 
Follow link in error and enable Compute Engine API.  This will require adding a billing method.


Enable the Container Engine API: 
- **https://console.cloud.google.com/apis/api/container.googleapis.com/overview?project=[PROJECT-NAME]**

https://console.developers.google.com/apis/api/compute_component/overview?project=104379591457
