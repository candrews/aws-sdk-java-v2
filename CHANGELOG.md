# __2.5.57__ __2019-06-05__
## __AWS Glue__
  - ### Features
    - Support specifying python version for Python shell jobs. A new parameter PythonVersion is added to the JobCommand data type.

# __2.5.56__ __2019-06-04__
## __AWS Identity and Access Management__
  - ### Features
    - This release adds validation for policy path field. This field is now restricted to be max 512 characters.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now supports AWS PrivateLink, enabling you to administer and use gateways without needing to use public IP addresses or a NAT/Internet Gateway, while avoiding traffic from going over the internet.

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache now allows you to apply available service updates on demand. Features included: (1) Access to the list of applicable service updates and their priorities. (2) Service update monitoring and regular status updates. (3) Recommended apply-by-dates for scheduling the service updates, which is critical if your cluster is in ElastiCache-supported compliance programs. (4) Ability to stop and later re-apply updates. For more information, see https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Self-Service-Updates.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Host Recovery feature which automatically restarts instances on to a new replacement host if failures are detected on Dedicated Host.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for s3

# __2.5.55__ __2019-06-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 I3en instances are the new storage-optimized instances offering up to 60 TB NVMe SSD instance storage and up to 100 Gbps of network bandwidth.

## __Amazon Relational Database Service__
  - ### Features
    - Amazon RDS Data API is generally available. Removing beta notes in the documentation.

# __2.5.54__ __2019-05-30__
## __AWS CodeCommit__
  - ### Features
    - This release adds APIs that allow adding and removing tags to a repository, and viewing tags for a repository. It also enables adding tags when creating a repository.

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics adds the option to use your own S3 bucket to store channel and data store resources. Previously, only service-managed storage was used.

## __AWS IoT Events__
  - ### Features
    - The AWS IoT Events service allows customers to monitor their IoT devices and sensors to detect failures or changes in operation and to trigger actions when these events occur

## __AWS IoT Events Data__
  - ### Features
    - The AWS IoT Events service allows customers to monitor their IoT devices and sensors to detect failures or changes in operation and to trigger actions when these events occur

## __AWS RDS DataService__
  - ### Features
    - The RDS Data API is generally available for the MySQL-compatible edition of Amazon Aurora Serverless in the US East (N. Virginia and Ohio), US West (Oregon), EU (Ireland), and Asia Pacific (Tokyo) regions. This service enables you to easily access Aurora Serverless clusters with web services-based applications including AWS Lambda and AWS AppSync. The new APIs included in this SDK release are ExecuteStatement, BatchExecuteStatement, BeginTransaction, CommitTransaction, and RollbackTransaction. The ExecuteSql API is deprecated; instead use ExecuteStatement which provides additional functionality including transaction support.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Improved exception messages in credential providers to exclude detailed parse errors that may contain sensitive information.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog ListStackInstancesForProvisionedProduct API enables customers to get details of a provisioned product with type "CFN_STACKSET". By passing the provisioned product id, the API will list account, region and status of each stack instances that are associated with this provisioned product.

## __Amazon Pinpoint Email Service__
  - ### Features
    - You can now specify whether the Amazon Pinpoint Email service must deliver email over a connection that is encrypted using Transport Layer Security (TLS).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Activity Streams for database clusters.

## __Managed Streaming for Kafka__
  - ### Features
    - Updated APIs for Amazon MSK to enable new features such as encryption in transit, client authentication, and scaling storage.

# __2.5.53__ __2019-05-29__
## __AWS IoT Things Graph__
  - ### Features
    - Initial release.

## __AWS SecurityHub__
  - ### Features
    - This update adds the ListProductSubscribers API, DescribeProducts API, removes CONTAINS as a comparison value for the StringFilter, and only allows use of EQUALS instead of CONTAINS in MapFilter.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Customers can now simultaneously take snapshots of multiple EBS volumes attached to an EC2 instance. With this new capability, snapshots guarantee crash-consistency across multiple volumes by preserving the order of IO operations. This new feature is fully integrated with Amazon Data Lifecycle Manager (DLM) allowing customers to automatically manage snapshots by creating lifecycle policies.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Customers can now simultaneously take snapshots of multiple EBS volumes attached to an EC2 instance. With this new capability, snapshots guarantee crash-consistency across multiple volumes by preserving the order of IO operations. This new feature is fully integrated with Amazon Data Lifecycle Manager (DLM) allowing customers to automatically manage snapshots by creating lifecycle policies.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon S3__
  - ### Bugfixes
    - Allows S3 to be used with object keys that have a leading slash "/myKey"

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager - Documentation updates

# __2.5.52__ __2019-05-28__
## __AWS Ground Station__
  - ### Features
    - AWS Ground Station is a fully managed service that enables you to control satellite communications, downlink and process satellite data, and scale your satellite operations efficiently and cost-effectively without having to build or manage your own ground station infrastructure.

## __AWS RoboMaker__
  - ### Features
    - Added support for an additional robot software suite (Gazebo 9) and for cancelling deployment jobs.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for iam

## __AWS Storage Gateway__
  - ### Features
    - Introduce AssignTapePool operation to allow customers to migrate tapes between pools.

## __AWS WAF__
  - ### Features
    - Documentation updates for waf

## __Amazon Chime__
  - ### Features
    - This release adds the ability to search and order toll free phone numbers for Voice Connectors.

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds support for programmatic access to Deliverability dashboard subscriptions and the deliverability data provided by the Deliverability dashboard for domains and IP addresses. The data includes placement metrics for campaigns that use subscribed domains to send email.

## __Amazon Relational Database Service__
  - ### Features
    - Add a new output field Status to DBEngineVersion which shows the status of the engine version (either available or deprecated). Add a new parameter IncludeAll to DescribeDBEngineVersions to make it possible to return both available and deprecated engine versions. These changes enable a user to create a Read Replica of an DB instance on a deprecated engine version.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Modern Standard Arabic (ar-SA).

# __2.5.51__ __2019-05-24__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy now supports tagging for the application and deployment group resources.

## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - MediaStore - This release adds support for chunked transfer of objects, which reduces latency by making an object available for downloading while it is still being uploaded.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for OpsWorks for Chef Automate; attribute values updated for Chef Automate 2.0 release.

# __2.5.50__ __2019-05-23__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Updated aws-java-sdk and bom modules to include ALL service modules.

## __AWS WAF Regional__
  - ### Features
    - Documentation updates for waf-regional

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New APIs to enable EBS encryption by default feature. Once EBS encryption by default is enabled in a region within the account, all new EBS volumes and snapshot copies are always encrypted

# __2.5.49__ __2019-05-22__
## __AWS Budgets__
  - ### Features
    - Added new datatype PlannedBudgetLimits to Budget model, and updated examples for AWS Budgets API for UpdateBudget, CreateBudget, DescribeBudget, and DescribeBudgets

## __AWS Device Farm__
  - ### Features
    - This release introduces support for tagging, tag-based access control, and resource-based access control.

## __AWS Service Catalog__
  - ### Features
    - Service Catalog UpdateProvisionedProductProperties API enables customers to manage provisioned product ownership. Administrators can now update the user associated to a provisioned product to another user within the same account allowing the new user to describe, update, terminate and execute service actions in that Service Catalog resource. New owner will also be able to list and describe all past records executed for that provisioned product.

## __Amazon API Gateway__
  - ### Features
    - This release adds support for tagging of Amazon API Gateway resources.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds idempotency support for associate, create route and authorization APIs for AWS Client VPN Endpoints.

## __Amazon Elastic File System__
  - ### Features
    - AWS EFS documentation updated to reflect the minimum required value for ProvisionedThroughputInMibps is 1 from the previously documented 0. The service has always required a minimum value of 1, therefor service behavior is not changed.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. This release introduces new APIs to associate and manage website authorization providers with Amazon WorkLink fleets.

# __2.5.48__ __2019-05-21__
## __AWS DataSync__
  - ### Features
    - Documentation update and refine pagination token on Datasync List API's

## __Alexa For Business__
  - ### Features
    - This release contains API changes to allow customers to create and manage Network Profiles for their Shared devices

# __2.5.47__ __2019-05-20__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - AWS Elemental MediaPackage now supports Video-on-Demand (VOD) workflows. These new features allow you to easily deliver a vast library of source video Assets stored in your own S3 buckets using a small set of simple to set up Packaging Configurations and Packaging Groups.

## __AWSMarketplace Metering__
  - ### Features
    - Documentation updates for meteringmarketplace

## __Managed Streaming for Kafka__
  - ### Features
    - Updated APIs for the Managed Streaming for Kafka service that let customers create clusters with custom Kafka configuration.

# __2.5.46__ __2019-05-17__
## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing subscriptions to AppStream 2.0 usage reports and configuring idle disconnect timeouts on AppStream 2.0 fleets.

# __2.5.45__ __2019-05-16__
## __AWS Elemental MediaLive__
  - ### Features
    - Added channel state waiters to MediaLive.

## __Amazon Simple Storage Service__
  - ### Features
    - This release updates the Amazon S3 PUT Bucket replication API to include a new optional field named token, which allows you to add a replication configuration to an S3 bucket that has Object Lock enabled.

# __2.5.44__ __2019-05-15__
## __AWS CodePipeline__
  - ### Features
    - This feature includes new APIs to add, edit, remove and view tags for pipeline, custom action type and webhook resources. You can also add tags while creating these resources.

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds optional configuration for DASH SegmentTemplateFormat to refer to segments by Number with Duration, rather than Number or Time with SegmentTimeline.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug in `EventStreamAsyncResponseTransformer` where the reference to the current stream `Subscriber` is not reset in `prepare`, causing an `IllegalStateException` to be thrown when attemping to subscribe to the event stream upon a retry.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding tagging support for VPC Endpoints and VPC Endpoint Services.

## __Amazon Relational Database Service__
  - ### Features
    - In the RDS API and CLI documentation, corrections to the descriptions for Boolean parameters to avoid references to TRUE and FALSE. The RDS CLI does not allow TRUE and FALSE values values for Boolean parameters.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Indian English (en-IN) and Hindi (hi-IN).

# __2.5.43__ __2019-05-14__
## __AWS Storage Gateway__
  - ### Features
    - Add Tags parameter to CreateSnapshot and UpdateSnapshotSchedule APIs, used for creating tags on create for one off snapshots and scheduled snapshots.

## __Amazon Chime__
  - ### Features
    - Amazon Chime private bots GA release.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend now supports Virtual Private Cloud for Asynchronous Batch Processing jobs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Pagination support for ec2.DescribeSubnets, ec2.DescribeDhcpOptions

# __2.5.42__ __2019-05-13__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now enables exclude and include filters to control what files and directories will be copied as part of a task execution.

## __AWS IoT Analytics__
  - ### Features
    - ContentDeliveryRule to support sending dataset to S3 and glue

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Node.js v10

# __2.5.41__ __2019-05-10__
## __AWS Glue__
  - ### Features
    - AWS Glue now supports specifying existing catalog tables for a crawler to examine as a data source. A new parameter CatalogTargets is added to the CrawlerTargets data type.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug where events in an event stream were being signed with the request date, and not with the current system time.

## __AWS Security Token Service__
  - ### Features
    - AWS Security Token Service (STS) now supports passing IAM Managed Policy ARNs as session policies when you programmatically create temporary sessions for a role or federated user. The Managed Policy ARNs can be passed via the PolicyArns parameter, which is now available in the AssumeRole, AssumeRoleWithWebIdentity, AssumeRoleWithSAML, and GetFederationToken APIs. The session policies referenced by the PolicyArn parameter will only further restrict the existing permissions of an IAM User or Role for individual sessions.

# __2.5.40__ __2019-05-08__
## __AWS IoT 1-Click Projects Service__
  - ### Features
    - Added automatic pagination support for ListProjects and ListPlacements APIs.

## __AWS Service Catalog__
  - ### Features
    - Adds "Parameters" field in UpdateConstraint API, which will allow Admin user to update "Parameters" in created Constraints.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Documentation update for Amazon EKS to clarify allowed parameters in update-cluster-config.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Data Analytics APIs now support tagging on applications.

## __Amazon SageMaker Service__
  - ### Features
    - Workteams now supports notification configurations. Neo now supports Jetson Nano as a target device and NumberOfHumanWorkersPerDataObject is now included in the ListLabelingJobsForWorkteam response.

# __2.5.39__ __2019-05-07__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports the ability to add additional authentication providers to your AWS AppSync GraphQL API as well as the ability to retrieve directives configured against fields or object type definitions during schema introspection.

## __AWS Storage Gateway__
  - ### Features
    - Add optional field AdminUserList to CreateSMBFileShare and UpdateSMBFileShare APIs.

## __Alexa For Business__
  - ### Features
    - This release adds an API allowing authorized users to delete a shared device's history of voice recordings and associated response data.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Patch Manager adds support for Microsoft Application Patching.

# __2.5.38__ __2019-05-06__
## __AWS CodePipeline__
  - ### Features
    - Documentation updates for codepipeline

## __AWS Config__
  - ### Features
    - AWS Config now supports tagging on PutConfigRule, PutConfigurationAggregator and PutAggregationAuthorization APIs.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for sts

# __2.5.37__ __2019-05-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - DASH output groups using DRM encryption can now enable a playback device compatibility mode to correct problems with playback on older devices.

## __AWS Elemental MediaLive__
  - ### Features
    - You can now switch the channel mode of your channels from standard to single pipeline and from single pipeline to standard. In order to switch a channel from single pipeline to standard all inputs attached to the channel must support two encoder pipelines.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release of Amazon Cognito User Pools introduces the new AdminSetUserPassword API that allows administrators of a user pool to change a user's password. The new password can be temporary or permanent.

## __Amazon WorkMail__
  - ### Features
    - Amazon WorkMail is releasing two new actions: 'GetMailboxDetails' and 'UpdateMailboxQuota'. They add insight into how much space is used by a given mailbox (size) and what its limit is (quota). A mailbox quota can be updated, but lowering the value will not influence WorkMail per user charges. For a closer look at the actions please visit https://docs.aws.amazon.com/workmail/latest/APIReference/API_Operations.html

# __2.5.36__ __2019-05-02__
## __AWS Key Management Service__
  - ### Features
    - AWS Key Management Service (KMS) can return an INTERNAL_ERROR connection error code if it cannot connect a custom key store to its AWS CloudHSM cluster. INTERNAL_ERROR is one of several connection error codes that help you to diagnose and fix a problem with your custom key store.

## __Alexa For Business__
  - ### Features
    - This release allows developers and customers to send text and audio announcements to rooms.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug in the Netty client where the read timeout isn't applied correctly for some requests.

# __2.5.35__ __2019-05-01__
## __AWS X-Ray__
  - ### Features
    - AWS X-Ray now includes Analytics, an interactive approach to analyzing user request paths (i.e., traces). Analytics will allow you to easily understand how your application and its underlying services are performing. With X-Ray Analytics, you can quickly detect application issues, pinpoint the root cause of the issue, determine the severity of the issues, and identify which end users were impacted. With AWS X-Ray Analytics you can explore, analyze, and visualize traces, allowing you to find increases in response time to user requests or increases in error rates. Metadata around peak periods, including frequency and actual times of occurrence, can be investigated by applying filters with a few clicks. You can then drill down on specific errors, faults, and response time root causes and view the associated traces.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces additional task definition parameters that enable you to define secret options for Docker log configuration, a per-container list contains secrets stored in AWS Systems Manager Parameter Store or AWS Secrets Manager.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an API for the modification of a VPN Connection, enabling migration from a Virtual Private Gateway (VGW) to a Transit Gateway (TGW), while preserving the VPN endpoint IP addresses on the AWS side as well as the tunnel options.

# __2.5.34__ __2019-04-30__
## __AWS CodePipeline__
  - ### Features
    - This release contains an update to the PipelineContext object that includes the Pipeline ARN, and the Pipeline Execution Id. The ActionContext object is also updated to include the Action Execution Id.

## __AWS Direct Connect__
  - ### Features
    - This release adds support for AWS Direct Connect customers to use AWS Transit Gateway with AWS Direct Connect gateway to route traffic between on-premise networks and their VPCs.

## __AWS Service Catalog__
  - ### Features
    - Admin users can now associate/disassociate aws budgets with a portfolio or product in Service Catalog. End users can see the association by listing it or as part of the describe portfolio/product output. A new optional boolean parameter, "DisableTemplateValidation", is added to ProvisioningArtifactProperties data type. The purpose of the parameter is to enable or disable the CloudFormation template validtion when creating a product or a provisioning artifact.

## __Amazon Managed Blockchain__
  - ### Features
    - (New Service) Amazon Managed Blockchain is a fully managed service that makes it easy to create and manage scalable blockchain networks using popular open source frameworks.

## __Amazon Neptune__
  - ### Features
    - Adds a feature to allow customers to specify a custom parameter group when restoring a database cluster.

# __2.5.33__ __2019-04-29__
## __AWS Transfer for SFTP__
  - ### Features
    - This release adds support for per-server host-key management. You can now specify the SSH RSA private key used by your SFTP server.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for Elastic Fabric Adapter (EFA) ENIs.

# __2.5.32__ __2019-04-26__
## __AWS Identity and Access Management__
  - ### Features
    - AWS Security Token Service (STS) enables you to request session tokens from the global STS endpoint that work in all AWS Regions. You can configure the global STS endpoint to vend session tokens that are compatible with all AWS Regions using the new IAM SetSecurityTokenServicePreferences API.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix bug in ChecksumValidatingSubscriber which results in NPE if checksum validation fails.

## __Amazon Simple Notification Service__
  - ### Features
    - With this release AWS SNS adds tagging support for Topics.

# __2.5.31__ __2019-04-25__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports the GetLayerVersionByArn API.

## __Amazon DynamoDB__
  - ### Features
    - This update allows you to tag Amazon DynamoDB tables when you create them. Tags are labels you can attach to AWS resources to make them easier to manage, search, and filter.

## __Amazon GameLift__
  - ### Features
    - This release introduces the new Realtime Servers feature, giving game developers a lightweight yet flexible solution that eliminates the need to build a fully custom game server. The AWS SDK updates provide support for scripts, which are used to configure and customize Realtime Servers.

## __Amazon Inspector__
  - ### Features
    - AWS Inspector - Improve the ListFindings API response time and decreases the maximum number of agentIDs from 500 to 99.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for workspaces

## __Netty NIO Async Http Client__
  - ### Bugfixes
    - Add workaround to await channel pools to be closed before shutting down EventLoopGroup to avoid the race condition between `channelPool.close` and `eventLoopGroup.shutdown`. See [#1109](https://github.com/aws/aws-sdk-java-v2/issues/1109).

# __2.5.30__ __2019-04-24__
## __AWS CloudFormation__
  - ### Features
    - Documentation updates for cloudformation

## __AWS MediaConnect__
  - ### Features
    - Adds support for ListEntitlements pagination.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor SDK now includes a new parameter to support origin servers that produce single-period DASH manifests.

## __AWS SDK for Java v2__
  - ### Features
    - Make `BytesWrapper`, parent of `SdkBytes` and `ResponseBytes`, public. Fixes [#1208](https://github.com/aws/aws-sdk-java-v2/issues/1208).
    - Support for `credential_source` property in profiles.

  - ### Bugfixes
    - Fixed a bug in asynchronous clients, where a service closing a connection between when a channel is acquired and handlers are attached could lead to response futures never being completed. Fixes [#1207](https://github.com/aws/aws-sdk-java-v2/issues/1207).

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now supports Access Control Lists (ACLs) on File Gateway SMB shares, enabling you to apply fine grained access controls for Active Directory users and groups.

## __Alexa For Business__
  - ### Features
    - This release adds support for the Alexa for Business gateway and gateway group APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 general purpose burstable instance types T3a that feature AMD EPYC processors.

## __Amazon Relational Database Service__
  - ### Features
    - A new parameter "feature-name" is added to the add-role and remove-role db cluster APIs. The value for the parameter is optional for Aurora MySQL compatible database clusters, but mandatory for Aurora PostgresQL. You can find the valid list of values using describe db engine versions API.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Asia Pacific (Hong Kong) Region (ap-east-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to allow customers to configure parameters to use either the standard-parameter tier (the default tier) or the advanced-parameter tier. It allows customers to create parameters with larger values and attach parameter policies to an Advanced Parameter.

## __Amazon Textract__
  - ### Features
    - This release adds support for checkbox also known as SELECTION_ELEMENT in Amazon Textract.

# __2.5.29__ __2019-04-19__
## __AWS Resource Groups__
  - ### Features
    - The AWS Resource Groups service increased the query size limit to 4096 bytes.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in Spanish Spanish (es-ES).

## __Amazon WorkSpaces__
  - ### Features
    - Added a new reserved field.

# __2.5.28__ __2019-04-18__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's DescribeImportTasks and BatchDeleteImportData APIs now return additional statuses for error reporting.

## __AWS Organizations__
  - ### Features
    - AWS Organizations is now available in the AWS GovCloud (US) Regions, and we added a new API action for creating accounts in those Regions. For more information, see CreateGovCloudAccount in the AWS Organizations API Reference.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Document updates for Amazon Cognito Identity Provider.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the TimeoutAction parameter to the ScalingConfiguration of an Aurora Serverless DB cluster. You can now configure the behavior when an auto-scaling capacity change can't find a scaling point.

## __Amazon S3__
  - ### Bugfixes
    - Reduced the frequency of 'server failed to send complete response' exceptions when using S3AsyncClient.

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. This release introduces new APIs to link and manage internal websites and web apps with Amazon WorkLink fleets.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for workspaces

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon Kafka - Added tagging APIs

# __2.5.27__ __2019-04-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for requester-managed Interface VPC Endpoints (powered by AWS PrivateLink). The feature prevents VPC endpoint owners from accidentally deleting or otherwise mismanaging the VPC endpoints of some AWS VPC endpoint services.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds Arabic language support with new female voice - "Zeina"

# __2.5.26__ __2019-04-16__
## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS SDK for Java v2__
  - ### Features
    - Enable support for credential_process in an AWS credential profile

## __AWS Storage Gateway__
  - ### Features
    - This change allows you to select either a weekly or monthly maintenance window for your volume or tape gateway. It also allows you to tag your tape and volume resources on creation by adding a Tag value on calls to the respective api endpoints.

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds support for the new email configuration in Amazon Cognito User Pools. You can now specify whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES email configuration.

## __Amazon Redshift__
  - ### Features
    - DescribeResize can now return percent of data transferred from source cluster to target cluster for a classic resize.

## __AmazonMQ__
  - ### Features
    - This release adds the ability to retrieve information about broker engines and broker instance options. See Broker Engine Types and Broker Instance Options in the Amazon MQ REST API Reference.

## __Netty NIO Http Client__
  - ### Bugfixes
    - Update `UnusedChannelExceptionHandler` to check the cause of the exception so that it does emit warn logs if the cause is netty io exception. See [#1171](https://github.com/aws/aws-sdk-java-v2/issues/1171)

# __2.5.25__ __2019-04-05__
## __AWS Elemental MediaConvert__
  - ### Features
    - Rectify incorrect modelling of DisassociateCertificate method

## __AWS Elemental MediaLive__
  - ### Features
    - Today AWS Elemental MediaLive (https://aws.amazon.com/medialive/) adds the option to create "Single Pipeline" channels, which offers a lower-cost option compared to Standard channels. MediaLive Single Pipeline channels have a single encoding pipeline rather than the redundant dual Availability Zone (AZ) pipelines that MediaLive provides with a "Standard" channel.

## __AWS Glue__
  - ### Features
    - AWS Glue now supports workerType choices in the CreateJob, UpdateJob, and StartJobRun APIs, to be used for memory-intensive jobs.

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - Documentation updates for 1-Click: improved descriptions of resource tagging APIs.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Lazily initialize `ApiCallTimeoutException` and `ApiCallAttemptTimeoutException`. This change would improve performance of async api calls.

## __AWS Transcribe Streaming__
  - ### Features
    - Amazon Transcribe now supports GB English, CA French and FR French which expands upon the existing language support for US English and US Spanish.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend provides confusion matrix for custom document classifier.

# __2.5.24__ __2019-04-04__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for iam

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support to enable or disable publishing Kubernetes cluster logs in AWS CloudWatch

# __2.5.23__ __2019-04-03__
## __AWS Batch__
  - ### Features
    - Support for GPU resource requirement in RegisterJobDefinition and SubmitJob

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend adds tagging support for document-classifiers and entity-recognizers.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug where SNI was not enabled in Netty NIO Async Client for TLS and caused the requests to fail of handshake_failure in some services. See [#1171](https://github.com/aws/aws-sdk-java-v2/issues/1171)

# __2.5.22__ __2019-04-02__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS SecurityHub__
  - ### Features
    - This update includes 3 additional error codes: AccessDeniedException, InvalidAccessException, and ResourceConflictException. This update also removes the error code ResourceNotFoundException from the GetFindings, GetInvitationsCount, ListInvitations, and ListMembers operations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add paginators.

# __2.5.21__ __2019-04-01__
## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR adds the ability to modify instance group configurations on a running cluster through the new "configurations" field in the ModifyInstanceGroups API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - March 2019 documentation updates for Systems Manager.

# __2.5.20__ __2019-03-29__
## __AWS Greengrass__
  - ### Features
    - Greengrass APIs now support tagging operations on resources

## __Amazon API Gateway__
  - ### Bugfixes
    - Fix the SDK cloberring existed 'Accept' headers on marshalled requests.

## __Amazon CloudWatch__
  - ### Features
    - Added 3 new APIs, and one additional parameter to PutMetricAlarm API, to support tagging of CloudWatch Alarms.

## __Amazon Comprehend__
  - ### Features
    - With this release AWS Comprehend supports encryption of output results of analysis jobs and volume data on the storage volume attached to the compute instance that processes the analysis job.

# __2.5.19__ __2019-03-28__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds a new output locking mode synchronized to the Unix epoch.

## __AWS Service Catalog__
  - ### Features
    - Adds "Tags" field in UpdateProvisionedProduct API. The product should have a new RESOURCE_UPDATE Constraint with TagUpdateOnProvisionedProduct field set to ALLOWED for it to work. See API docs for CreateConstraint for more information

## __Amazon Pinpoint Email Service__
  - ### Features
    - This release adds support for using the Amazon Pinpoint Email API to tag the following types of Amazon Pinpoint resources: configuration sets; dedicated IP pools; deliverability dashboard reports; and, email identities. A tag is a label that you optionally define and associate with these types of resources. Tags can help you categorize and manage these resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags. For more information, see the Amazon Pinpoint Email API Reference.

## __Amazon WorkSpaces__
  - ### Features
    - Amazon WorkSpaces adds tagging support for WorkSpaces Images, WorkSpaces directories, WorkSpaces bundles and IP Access control groups.

# __2.5.18__ __2019-03-27__
## __AWS App Mesh__
  - ### Features
    - This release includes AWS Tagging integration for App Mesh, VirtualNode access logging, TCP routing, and Mesh-wide external traffic egress control. See https://docs.aws.amazon.com/app-mesh/latest/APIReference/Welcome.html for more details.

## __AWS Storage Gateway__
  - ### Features
    - This change allows you to select a pool for archiving virtual tapes. Pools are associated with S3 storage classes. You can now choose to archive virtual tapes in either S3 Glacier or S3 Glacier Deep Archive storage class. CreateTapes API now takes a new PoolId parameter which can either be GLACIER or DEEP_ARCHIVE. Tapes created with this parameter will be archived in the corresponding storage class.

## __AWS Transfer for SFTP__
  - ### Features
    - This release adds PrivateLink support to your AWS SFTP server endpoint, enabling the customer to access their SFTP server within a VPC, without having to traverse the internet. Customers can now can create a server and specify an option whether they want the endpoint to be hosted as public or in their VPC, and with the in VPC option, SFTP clients and users can access the server only from the customer's VPC or from their on-premises environments using DX or VPN. This release also relaxes the SFTP user name requirements to allow underscores and hyphens.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for external deployment controllers for ECS services with the launch of task set management APIs. Task sets are a new primitive for controlled management of application deployments within a single ECS service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You can now launch the new Amazon EC2 R5ad and M5ad instances that feature local NVMe attached SSD instance storage (up to 3600 GB). M5ad and R5ad feature AMD EPYC processors that offer a 10% cost savings over the M5d and R5d EC2 instances.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Glacier Deep Archive provides secure, durable object storage class for long term data archival. This SDK release provides API support for this new storage class.

## __Apache Http Client__
  - ### Features
    - Add the ability to set a custom Apache HttpRoutePlanner and CredentialProvider

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for routing based on HTTP headers, methods, query string or query parameters and source IP addresses in Application Load Balancer.

# __2.5.17__ __2019-03-26__
## __AWS Glue__
  - ### Features
    - This new feature will now allow customers to add a customized csv classifier with classifier API. They can specify a custom delimiter, quote symbol and control other behavior they'd like crawlers to have while recognizing csv files

## __Amazon WorkMail__
  - ### Features
    - Documentation updates for Amazon WorkMail.

# __2.5.16__ __2019-03-25__
## __AWS Direct Connect__
  - ### Features
    - Direct Connect gateway enables you to establish connectivity between your on-premise networks and Amazon Virtual Private Clouds (VPCs) in any commercial AWS Region (except in China) using AWS Direct Connect connections at any AWS Direct Connect location. This release enables multi-account support for Direct Connect gateway, with multi-account support for Direct Connect gateway, you can associate up to ten VPCs from any AWS account with a Direct Connect gateway. The AWS accounts owning VPCs and the Direct Connect gateway must belong to the same AWS payer account ID. This release also enables Direct Connect Gateway owners to allocate allowed prefixes from each associated VPCs.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds support for detailed job progress status and S3 server-side output encryption. In addition, the anti-alias filter will now be automatically applied to all outputs

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - This release adds tagging support for AWS IoT 1-Click Device resources. Use these APIs to add, remove, or list tags on Devices, and leverage the tags for various authorization and billing scenarios. This release also adds the ARN property for DescribeDevice response object.

## __AWS IoT Analytics__
  - ### Features
    - This change allows you to specify the number of versions of IoT Analytics data set content to be retained. Previously, the number of versions was managed implicitly via the setting of the data set's retention period.

## __AWS RoboMaker__
  - ### Features
    - Added additional progress metadata fields for robot deployments

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - With this release Amazon Transcribe enhances the custom vocabulary feature to improve accuracy by providing customization on pronunciations and output formatting.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now allows customer to centrally enable AWS Shield Advanced DDoS protection for their entire AWS infrastructure, across accounts and applications.

## __URL Connection Http Client__
  - ### Bugfixes
    - Bypass ssl validations when `TRUST_ALL_CERTIFICATES` is set to true.

# __2.5.15__ __2019-03-22__
## __AWS IoT 1-Click Projects Service__
  - ### Features
    - This release adds tagging support for AWS IoT 1-Click Project resources. Use these APIs to add, remove, or list tags on Projects, and leverage the tags for various authorization and billing scenarios. This release also adds the ARN property to projects for DescribeProject and ListProject responses.

## __Amazon CloudSearch Domain__
  - ### Bugfixes
    - Use application/x-www-form-urlencoded as Content-Type for search API

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe - support transcriptions from audio sources in German (de-DE) and Korean (ko-KR).

## __Netty NIO Http Client__
  - ### Features
    - Add sslProvider configuration in `NettyNioAsyncHttpClient.Builder`.

# __2.5.14__ __2019-03-21__
## __AWS IoT__
  - ### Features
    - This release adds the GetStatistics API for the AWS IoT Fleet Indexing Service, which allows customers to query for statistics about registered devices that match a search query. This release only supports the count statistics. For more information about this API, see https://docs.aws.amazon.com/iot/latest/apireference/API_GetStatistics.html

## __AWS SDK for Java v2__
  - ### Features
    - Automatically retry on `RequestThrottledException` error codes.

  - ### Bugfixes
    - Fix bug where the stream returned from a `ContentStreamProvider` is not closed after request execution. See [#1138](https://github.com/aws/aws-sdk-java-v2/issues/1138)

## __Amazon CloudWatch Events__
  - ### Features
    - Added 3 new APIs, and one additional parameter to the PutRule API, to support tagging of CloudWatch Events rules.

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds tags and tag-based access control support to Amazon Cognito User Pools.

## __Amazon Lightsail__
  - ### Features
    - This release adds the DeleteKnownHostKeys API, which enables Lightsail's browser-based SSH or RDP clients to connect to the instance after a host key mismatch.

## __Amazon S3__
  - ### Bugfixes
    - Fix bug in `ChecksumCalculatingInputStream` where methods not overridden, such as `close()`, are not called on the wrapped stream. See [#1138](https://github.com/aws/aws-sdk-java-v2/issues/1138).

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __2.5.13__ __2019-03-20__
## __AWS CodePipeline__
  - ### Features
    - Add support for viewing details of each action execution belonging to past and latest pipeline executions that have occurred in customer's pipeline. The details include start/updated times, action execution results, input/output artifacts information, etc. Customers also have the option to add pipelineExecutionId in the input to filter the results down to a single pipeline execution.

## __AWSMarketplace Metering__
  - ### Features
    - This release increases AWS Marketplace Metering Service maximum usage quantity to 2147483647 and makes parameters usage quantity and dryrun optional.

## __Amazon Cognito Identity__
  - ### Features
    - This release adds tags and tag-based access control support to Amazon Cognito Identity Pools (Federated Identities).

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug that could pollute non SDK threads with `ThreadLocal`'s when allocating memory. See [#1133](https://github.com/aws/aws-sdk-java-v2/issues/1133)

## __Netty NIO Http Client__
  - ### Bugfixes
    - Fix failed test NettyNioAsyncHttpClientSpiVerificationTest when running with JDK11. See [#1038](https://github.com/aws/aws-sdk-java-v2/issues/1038)

# __2.5.12__ __2019-03-19__
## __AWS Config__
  - ### Features
    - AWS Config adds a new API called SelectResourceConfig to run advanced queries based on resource configuration properties.

## __AWS SDK for Java v2__
  - ### Features
    - Adds the Java vendor the user agent as well as using the updated user agent for all HTTP calls

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Added support to control private/public access to the Kubernetes API-server endpoint

## __Amazon S3__
  - ### Features
    - Add support for getUrl operation. The API can be used to generate a URL that represents an object in Amazon S3. The url can only be used to download the object content if the object has public read permissions. Original issue: https://github.com/aws/aws-sdk-java-v2/issues/860

  - ### Bugfixes
    - Only set content type of S3 `CreateMultipartUploadRequest` if `Content-Type` header is not present and honor the overridden content type.

# __2.5.11__ __2019-03-18__
## __AWS Database Migration Service__
  - ### Features
    - S3 Endpoint Settings added support for 1) Migrating to Amazon S3 as a target in Parquet format 2) Encrypting S3 objects after migration with custom KMS Server-Side encryption. Redshift Endpoint Settings added support for encrypting intermediate S3 objects during migration with custom KMS Server-Side encryption.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix HeaderUnmarshaller to compare header ignoring cases.

## __Amazon Chime__
  - ### Features
    - This release adds support for the Amazon Chime Business Calling and Voice Connector features.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeFpgaImages API now returns a new DataRetentionSupport attribute to indicate if the AFI meets the requirements to support DRAM data retention. DataRetentionSupport is a read-only attribute.

# __2.5.10__ __2019-03-14__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added a new API action, RenewCertificate. RenewCertificate causes ACM to force the renewal of any private certificate which has been exported.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private CA allows customers to manage permissions on their CAs. Customers can grant or deny AWS Certificate Manager permission to renew exported private certificates.

## __AWS Config__
  - ### Features
    - AWS Config - add ability to tag, untag and list tags for ConfigRule, ConfigurationAggregator and AggregationAuthorization resource types. Tags can be used for various scenarios including tag based authorization.

## __AWS IoT__
  - ### Features
    - In this release, AWS IoT introduces support for tagging OTA Update and Stream resources. For more information about tagging, see the AWS IoT Developer Guide.

## __Amazon CloudWatch__
  - ### Features
    - New Messages parameter for the output of GetMetricData, to support new metric search functionality.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds tagging support for Dedicated Host Reservations.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports random search and hyperparameter scaling.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Backport `FixedChannelPool` fix from https://github.com/netty/netty/pull/7927, which ensures that the operation doesn't become blocked from closing the wrapped pool.
    - Fix a possible `NullPointerException` if `HttpOrHttp2ChannelPool` is closed while the protocol is still being determined. The operation is now done synchronously with other operations on the pool to prevent a data race.

# __2.5.9__ __2019-03-13__
## __AWS Config__
  - ### Features
    - Config released Remediation APIs allowing Remediation of Config Rules

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for logs

## __Netty Nio HTTP Client__
  - ### Bugfixes
    - Update `SslCompletionEventHandler` to close channel for `SslCloseCompletionEvent` only if the channel is not currently in use. This would fix the race condition in the async clients causing incorrect IOException to be thrown when the service returns error response and closes the connection. See [#1076](https://github.com/aws/aws-sdk-java-v2/issues/1076)

# __2.5.8__ __2019-03-12__
## __AWSServerlessApplicationRepository__
  - ### Features
    - The AWS Serverless Application Repository now supports associating a ZIP source code archive with versions of an application.

## __Netty Nio Http Client__
  - ### Bugfixes
    - Fix a bug where the channel fails to be released if there is an exception thrown.

# __2.5.7__ __2019-03-11__
## __AWS Cost Explorer Service__
  - ### Features
    - The only change in this release is to make TimePeriod a required parameter in GetCostAndUsageRequest.

## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk added support for tagging, and tag-based access control, of all Elastic Beanstalk resources.

## __AWS Glue__
  - ### Features
    - CreateDevEndpoint and UpdateDevEndpoint now support Arguments to configure the DevEndpoint.

## __AWS IoT__
  - ### Features
    - Documentation updates for iot

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight user and group operation results now include group principal IDs and user principal IDs. This release also adds "DeleteUserByPrincipalId", which deletes users given their principal ID. The update also improves role session name validation.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition

## __Amazon S3__
  - ### Bugfixes
    - Set `Content-Type` to `binary/octet-stream` for `S3#createMultipartRequest`. See [#1092](https://github.com/aws/aws-sdk-java-v2/issues/1092)

## __Apache Http Client__
  - ### Bugfixes
    - Updated to not set a default `Content-Type` if the header does not exist. Per [RFC7231](https://tools.ietf.org/html/rfc7231#page-11), we should let the recipient to decide if not known.

# __2.5.6__ __2019-03-08__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild also now supports Git Submodules. CodeBuild now supports opting out of Encryption for S3 Build Logs. By default these logs are encrypted.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker notebook instances now support enabling or disabling root access for notebook users. SageMaker Neo now supports rk3399 and rk3288 as compilation target devices.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for s3

# __2.5.5__ __2019-03-07__
## __AWS App Mesh__
  - ### Features
    - This release includes a new version of the AWS App Mesh APIs. You can read more about the new APIs here: https://docs.aws.amazon.com/app-mesh/latest/APIReference/Welcome.html.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds a MediaPackage output group, simplifying configuration of outputs to AWS Elemental MediaPackage.

## __AWS Greengrass__
  - ### Features
    - Greengrass group UID and GID settings can now be configured to use a provided default via FunctionDefaultConfig. If configured, all Lambda processes in your deployed Greengrass group will by default start with the provided UID and/or GID, rather than by default starting with UID "ggc_user" and GID "ggc_group" as they would if not configured. Individual Lambdas can also be configured to override the defaults if desired via each object in the Functions list of your FunctionDefinitionVersion.

## __AWS SDK For Java v2__
  - ### Bugfixes
    - Fix bug in the generated async clients where cancelling the `CompletableFuture` returned from an async operation does not result in cancelling the underlying HTTP request execution. In some cases, this can lead to unnecesarily keeping resources from being freed until the request execution finishes.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces additional task definition parameters that enable you to define dependencies for container startup and shutdown, a per-container start and stop timeout value, as well as an AWS App Mesh proxy configuration which eases the integration between Amazon ECS and AWS App Mesh.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift-hosted instances can now securely access resources on other AWS services using IAM roles. See more details at https://aws.amazon.com/releasenotes/amazon-gamelift/.

## __Amazon Relational Database Service__
  - ### Features
    - You can configure your Aurora database cluster to automatically copy tags on the cluster to any automated or manual database cluster snapshots that are created from the cluster. This allows you to easily set metadata on your snapshots to match the parent cluster, including access policies. You may enable or disable this functionality while creating a new cluster, or by modifying an existing database cluster.

## __Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug where, if the future returned from the `NettyRequestExecutor#execute` is cancelled, the client continues to wait for the `Channel` acquire to complete, which leads to keeping potentially many resources around unnecessarily.

# __2.5.4__ __2019-03-06__
## __AWS Direct Connect__
  - ### Features
    - Exposed a new available port speeds field in the DescribeLocation api call.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix the generated ServiceMetadata classes for services that have PARTITION_OVERRIDDEN_ENDPOINTS

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds pagination support for ec2.DescribeVpcs, ec2.DescribeInternetGateways and ec2.DescribeNetworkAcls APIs

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for elasticfilesystem adding new examples for EFS Lifecycle Management feature.

# __2.5.3__ __2019-03-05__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for pausing and unpausing one or both pipelines at scheduled times.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Add missing non-service modules to bom. See [#1063](https://github.com/aws/aws-sdk-java-v2/issues/1063)

## __AWS Storage Gateway__
  - ### Features
    - ActivateGateway, CreateNFSFileShare and CreateSMBFileShare APIs support a new parameter: Tags (to be attached to the created resource). Output for DescribeNFSFileShare, DescribeSMBFileShare and DescribeGatewayInformation APIs now also list the Tags associated with the resource. Minimum length of a KMSKey is now 7 characters.

## __Amazon Textract__
  - ### Features
    - This release is intended ONLY for customers that are officially part of the Amazon Textract Preview program. If you are not officially part of the Amazon Textract program THIS WILL NOT WORK. Our two main regions for Amazon Textract Preview are N. Virginia and Dublin. Also some members have been added to Oregon and Ohio. If you are outside of any of these AWS regions, Amazon Textract Preview definitely will not work. If you would like to be part of the Amazon Textract program, you can officially request sign up here - https://pages.awscloud.com/textract-preview.html. To set expectations appropriately, we are aiming to admit new preview participants once a week until General Availability.

# __2.5.2__ __2019-03-04__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds support for user-defined tagging of MediaPackage resources. Users may now call operations to list, add and remove tags from channels and origin-endpoints. Users can also specify tags to be attached to these resources during their creation. Describe and list operations on these resources will now additionally return any tags associated with them.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to support service settings for AWS customers. A service setting is a key-value pair that defines how a user interacts with or uses an AWS service, and is typically created and consumed by the AWS service team. AWS customers can read a service setting via GetServiceSetting API and update the setting via UpdateServiceSetting API or ResetServiceSetting API, which are introduced in this release. For example, if an AWS service charges money to the account based on a feature or service usage, then the AWS service team might create a setting with the default value of "false". This means the user can't use this feature unless they update the setting to "true" and intentionally opt in for a paid feature.

# __2.5.1__ __2019-03-01__
## __AWS Auto Scaling Plans__
  - ### Features
    - Documentation updates for autoscaling-plans

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for modifying instance event start time which allows users to reschedule EC2 events.

# __2.5.0__ __2019-02-28__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix a bug in the code generator where the enum getter for a structure member is not being generated in some cases. Additionally, fix a bug that generated the wrong code for enum getters where the enum is not at the top level container but is nested, such as `List<List<EnumType>>`. This breaks the interface for affected services so the minor version is increased.
    - Fixed a bug where the request would fail of NoSuchElementException. This bug would affect `TranscribeStreaming#startStreamTranscription` request

## __Alexa For Business__
  - ### Features
    - This release adds the PutInvitationConfiguration API to configure the user invitation email template with custom attributes, and the GetInvitationConfiguration API to retrieve the configured values.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager State Manager now supports associations using documents shared by other AWS accounts.

## __AmazonApiGatewayV2__
  - ### Features
    - Marking certain properties as explicitly required and fixing an issue with the GetApiMappings operation for ApiMapping resources.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

## __Netty Nio HTTP Client__
  - ### Bugfixes
    - Added try-catch blocks to prevent uncompleted future when exception is thrown.

# __2.4.17__ __2019-02-27__
## __AWS WAF__
  - ### Features
    - Documentation updates for waf

## __AWS WAF Regional__
  - ### Features
    - Documentation updates for waf-regional

## __core__
  - ### Bugfixes
    - Netty 4.1.33.Final

# __2.4.16__ __2019-02-26__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for discovery

## __AWS Cost and Usage Report Service__
  - ### Features
    - Adding support for Athena and new report preferences to the Cost and Usage Report API.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added several features including support for: auto-rotation or user-specified rotation of 0, 90, 180, or 270 degrees; multiple output groups with DRM; ESAM XML documents to specify ad insertion points; Offline Apple HLS FairPlay content protection.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for opsworkscm

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Resource Groups__
  - ### Features
    - Documentation updates for Resource Groups API; updating description of Tag API.

## __Amazon Pinpoint__
  - ### Features
    - This release adds support for the Amazon Resource Groups Tagging API to Amazon Pinpoint, which means that you can now add and manage tags for Amazon Pinpoint projects (apps), campaigns, and segments. A tag is a label that you optionally define and associate with Amazon Pinpoint resource. Tags can help you categorize and manage these types of resources in different ways, such as by purpose, owner, environment, or other criteria. For example, you can use tags to apply policies or automation, or to identify resources that are subject to certain compliance requirements. A project, campaign, or segment can have as many as 50 tags. For more information about using and managing tags in Amazon Pinpoint, see the Amazon Pinpoint Developer Guide at https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html. For more information about the Amazon Resource Group Tagging API, see the Amazon Resource Group Tagging API Reference at https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html.

## __Amazon S3__
  - ### Bugfixes
    - Fix the issue where NoSuchBucketException was not unmarshalled for `s3#getBucketPolicy` when the bucket doesn't exist. See [#1088](https://github.com/aws/aws-sdk-java-v2/issues/1088)

# __2.4.15__ __2019-02-25__
## __AWS CodeCommit__
  - ### Removals
    - Removing invalid "fips" region

## __AWS Cost Explorer Service__
  - ### Features
    - Added metrics to normalized units.

## __AWS Elasticache__
  - ### Removals
    - Removing invalid "fips" region

## __AWS Elemental MediaStore__
  - ### Features
    - This release adds support for access logging, which provides detailed records for the requests that are made to objects in a container.

## __AWS SDK for Java v2__
  - ### Removals
    - Removes invalid AWS regions that don't match the partition regex

## __Amazon DynamoDB__
  - ### Removals
    - Removing invalid "local" region

## __Amazon MTurk__
  - ### Removals
    - Removing invalid "sandbox" region

## __Amazon S3__
  - ### Removals
    - Removing invalid dualstack regions and s3-external-1

## __Auto Scaling__
  - ### Features
    - Added support for passing an empty SpotMaxPrice parameter to remove a value previously set when updating an Amazon EC2 Auto Scaling group.

## __Elastic Load Balancing__
  - ### Features
    - This release enables you to use the existing client secret when modifying a rule with an action of type authenticate-oidc.

# __2.4.14__ __2019-02-22__
## __AWS Cloud9__
  - ### Features
    - Adding EnvironmentLifecycle to the Environment data type.

## __AWS Glue__
  - ### Features
    - AWS Glue adds support for assigning AWS resource tags to jobs, triggers, development endpoints, and crawlers. Each tag consists of a key and an optional value, both of which you define. With this capacity, customers can use tags in AWS Glue to easily organize and identify your resources, create cost allocation reports, and control access to resources.

## __AWS Step Functions__
  - ### Features
    - This release adds support for tag-on-create. You can now add tags when you create AWS Step Functions activity and state machine resources. For more information about tagging, see AWS Tagging Strategies.

## __Amazon Athena__
  - ### Features
    - This release adds tagging support for Workgroups to Amazon Athena. Use these APIs to add, remove, or list tags on Workgroups, and leverage the tags for various authorization and billing scenarios.

# __2.4.13__ __2019-02-21__
## __AWS CodeBuild__
  - ### Features
    - Add support for CodeBuild local caching feature

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

## __AWS Transfer for SFTP__
  - ### Features
    - Bug fix: increased the max length allowed for request parameter NextToken when paginating List operations

## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

## __Amazon Kinesis Video Streams__
  - ### Features
    - Documentation updates for Kinesis Video Streams

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - In this release, HLS playback of KVS streams can be configured to output MPEG TS fragments using the ContainerFormat parameter. HLS playback of KVS streams can also be configured to include the EXT-X-PROGRAM-DATE-TIME field using the DisplayFragmentTimestamp parameter.

## __Amazon Kinesis Video Streams Media__
  - ### Features
    - Documentation updates for Kinesis Video Streams

## __Amazon WorkDocs__
  - ### Features
    - Documentation updates for workdocs

# __2.4.12__ __2019-02-20__
## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding / updating / deleting / copying / moving / setting file modes for one or more files directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for VPC inputs, allowing you to push content from your Amazon VPC directly to MediaLive.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed an issue where the SDK could be over-retrying on signature errors.
    - Fixed an issue where the SDK could fail to adjust the local clock under skewed-clock conditions.

# __2.4.11__ __2019-02-19__
## __AWS Directory Service__
  - ### Features
    - This release adds support for tags during directory creation (CreateDirectory, CreateMicrosoftAd, ConnectDirectory).

## __AWS IoT__
  - ### Features
    - AWS IoT - AWS IoT Device Defender adds support for configuring behaviors in a security profile with statistical thresholds. Device Defender also adds support for configuring multiple data-point evaluations before a violation is either created or cleared.

## __Amazon Elastic File System__
  - ### Features
    - Amazon EFS now supports adding tags to file system resources as part of the CreateFileSystem API . Using this capability, customers can now more easily enforce tag-based authorization for EFS file system resources.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager now supports adding tags when creating Activations, Patch Baselines, Documents, Parameters, and Maintenance Windows

# __2.4.10__ __2019-02-18__
## __AWS SDK for Java v2__
  - ### Features
    - Updated service endpoint metadata.

## __AWS Secrets Manager__
  - ### Features
    - This release increases the maximum allowed size of SecretString or SecretBinary from 4KB to 7KB in the CreateSecret, UpdateSecret, PutSecretValue and GetSecretValue APIs.

## __Amazon Athena__
  - ### Features
    - This release adds support for Workgroups to Amazon Athena. Use Workgroups to isolate users, teams, applications or workloads in the same account, control costs by setting up query limits and creating Amazon SNS alarms, and publish query-related metrics to Amazon CloudWatch.

# __2.4.9__ __2019-02-15__
## __AWS IoT__
  - ### Features
    - In this release, IoT Device Defender introduces support for tagging Scheduled Audit resources.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Attach `extendedRequestId` to `AwsResponseMetadata` if available for event streaming operations so that customers can retrieve it from response metadata

## __Amazon Chime__
  - ### Features
    - Documentation updates for Amazon Chime

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for Application Auto Scaling

# __2.4.8__ __2019-02-14__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds tagging and ARN support for AWS Client VPN Endpoints.You can now run bare metal workloads on EC2 M5 and M5d instances. m5.metal and m5d.metal instances are powered by custom Intel Xeon Scalable Processors with a sustained all core frequency of up to 3.1 GHz. m5.metal and m5d.metal offer 96 vCPUs and 384 GiB of memory. With m5d.metal, you also have access to 3.6 TB of NVMe SSD-backed instance storage. m5.metal and m5d.metal instances deliver 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking, as well as 14 Gbps of bandwidth to EBS.You can now run bare metal workloads on EC2 z1d instances. z1d.metal instances are powered by custom Intel Xeon Scalable Processors with a sustained all core frequency of up to 4.0 GHz. z1d.metal offers 48 vCPUs, 384 GiB of memory, and 1.8 TB of NVMe SSD-backed instance storage. z1d.metal instances deliver 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking, as well as 14 Gbps of bandwidth to EBS.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Adds support for Tag-On-Create for Kinesis Video Streams. A list of tags associated with the stream can be created at the same time as the stream creation.

# __2.4.7__ __2019-02-13__
## __AWS MediaTailor__
  - ### Features
    - This release adds support for tagging AWS Elemental MediaTailor resources.

## __Amazon Elastic File System__
  - ### Features
    - Customers can now use the EFS Infrequent Access (IA) storage class to more cost-effectively store larger amounts of data in their file systems. EFS IA is cost-optimized storage for files that are not accessed every day. You can create a new file system and enable Lifecycle Management to automatically move files that have not been accessed for 30 days from the Standard storage class to the IA storage class.

## __Amazon Rekognition__
  - ### Features
    - GetContentModeration now returns the version of the moderation detection model used to detect unsafe content.

# __2.4.6__ __2019-02-12__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

## __AWS Transcribe Streaming__
  - ### Features
    - Amazon Transcribe now supports US Spanish, which expands upon the existing language support for US English.

## __Netty Nio HTTP Client__
  - ### Bugfixes
    - Awaits `EventLoopGroup#shutdownGracefully` to complete when closing Netty client.

# __2.4.5__ __2019-02-11__
## __AWS CodeBuild__
  - ### Features
    - Add customized webhook filter support

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds optional configuration for DASH to compact the manifest by combining duplicate SegmentTemplate tags. Adds optional configuration for DASH SegmentTemplate format to refer to segments by "Number" (default) or by "Time".

## __Amazon AppStream__
  - ### Features
    - This update enables customers to find the start time, max expiration time, and connection status associated with AppStream streaming session.

## __Amazon CloudWatch Logs__
  - ### Bugfixes
    - Fix infinite pagination bug in CloudWatchLogsClient.getLogEventsPaginator API. See https://github.com/aws/aws-sdk-java-v2/issues/1045

# __2.4.4__ __2019-02-08__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for the AWS Application Discovery Service.

## __AWS S3__
  - ### Bugfixes
    - Use request header to determine if checksum validation should be enabled for `s3#putObject`

## __AWS SDK for Java v2__
  - ### Features
    - Never initialie the default region provider chain if the region is always specified in the client builder.
    - Never initialize the default credentials provider chain if credentials are always specified in the client builder.

  - ### Bugfixes
    - Defer all errors raised when creating `ProfileCredentialsProvider` to the `resolveCredentials()` call.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - This release is to correct the timestamp format to ISO8601 for the DateCreated and DateModified files in the GetLifecyclePolicy response object.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS introduces the PutAccountSettingDefault API, an API that allows a user to set the default ARN/ID format opt-in status for all the roles and users in the account. Previously, setting the account's default opt-in status required the use of the root user with the PutAccountSetting API.

# __2.4.3__ __2019-02-07__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds tagging of channels, inputs, and input security groups.

## __AWS RoboMaker__
  - ### Features
    - Added support for tagging and tag-based access control for AWS RoboMaker resources. Also, DescribeSimulationJob now includes a new failureReason field to help debug simulation job failures

## __Amazon Elasticsearch Service__
  - ### Features
    - Feature: Support for three Availability Zone deployments

## __Amazon GameLift__
  - ### Features
    - This release delivers a new API action for deleting unused matchmaking rule sets. More details are available at https://aws.amazon.com/releasenotes/?tag=releasenotes%23keywords%23amazon-gamelift.

# __2.4.2__ __2019-02-06__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add Linux with SQL Server Standard, Linux with SQL Server Web, and Linux with SQL Server Enterprise to the list of allowed instance platforms for On-Demand Capacity Reservations.

## __Amazon FSx__
  - ### Features
    - New optional ExportPath parameter added to the CreateFileSystemLustreConfiguration object for user-defined export paths. Used with the CreateFileSystem action when creating an Amazon FSx for Lustre file system.

# __2.4.1__ __2019-02-05__
## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix an issue where an exception could be raised when configuring the idle connection reaper in the apache HTTP client [#1059](https://github.com/aws/aws-sdk-java-v2/issues/1059).

## __AWS Service Catalog__
  - ### Features
    - Service Catalog Documentation Update for ProvisionedProductDetail

## __AWS Shield__
  - ### Features
    - The DescribeProtection request now accepts resource ARN as valid parameter.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - ec2.DescribeVpcPeeringConnections pagination support

# __2.4.0__ __2019-02-04__
## __AWS CodeCommit__
  - ### Features
    - This release supports a more graceful handling of the error case when a repository is not associated with a pull request ID in a merge request in AWS CodeCommit.

## __AWS SDK for Java v2__
  - ### Features
    - Add support for `connectionTimeToLive`, `connectionMaxIdleTime` and `useIdleConnectionReaper` to the netty HTTP client.
    - Enable `useIdleConnectionReaper` by default for Netty and Apache.
    - Updated service endpoint metadata.

  - ### Bugfixes
    - Added a new handler ([#1041](https://github.com/aws/aws-sdk-java-v2/issues/1041)) to close channels which have triggered an SslCloseCompletionEvent and are no longer usable per [#452](https://github.com/aws/aws-sdk-java-v2/issues/452).
    - Fix the deadlock issue in `EventStreamAsyncResponseTransformer` for event streaming operations triggered in an edge case where customer subscriber signals `Subscription#request` the same time as `SdkPublisher` signals `Subscriber#onComplete`
    - Reduced netty client logging noise, by logging at a DEBUG level (instead of WARN) when encountering IO errors on channels not currently in use and not logging the whole stack trace.
    - Removed broken client methods: `BackupClient#getSupportedResourceTypes()` and `PinpointSmsVoiceClient.listConfigurationSets()`.

## __Amazon EC2 Container Service__
  - ### Features
    - This release of Amazon Elastic Container Service (Amazon ECS) introduces support for GPU workloads by enabling you to create clusters with GPU-enabled container instances.

## __Amazon WorkSpaces__
  - ### Features
    - This release sets ClientProperties as a required parameter.

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

## __Netty NIO HTTP Client__
  - ### Features
    - Allows customers to enable wire logging with the Netty client at debug level.

# __2.3.9__ __2019-01-25__
## __AWS CodeCommit__
  - ### Features
    - The PutFile API will now throw new exception FilePathConflictsWithSubmodulePathException when a submodule exists at the input file path; PutFile API will also throw FolderContentSizeLimitExceededException when the total size of any folder on the path exceeds the limit as a result of the operation.

## __AWS Device Farm__
  - ### Features
    - Introduces a new rule in Device Pools - "Availability". Customers can now ensure they pick devices that are available (i.e., not being used by other customers).

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Frame Capture output groups and for I-frame only manifests (playlists) in HLS output groups.

## __AWS MediaConnect__
  - ### Features
    - This release adds support for tagging, untagging, and listing tags for existing AWS Elemental MediaConnect resources.

# __2.3.8__ __2019-01-24__
## __AWS CodeBuild__
  - ### Features
    - This release adds support for cross-account ECR images and private registry authentication.

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation updates for CloudWatch Logs

## __Amazon EC2 Container Registry__
  - ### Features
    - Amazon ECR updated the default endpoint URL to support AWS Private Link.

## __Amazon Pinpoint SMS and Voice Service__
  - ### Features
    - Added the ListConfigurationSets operation, which returns a list of the configuration sets that are associated with your account.

## __Amazon Relational Database Service__
  - ### Features
    - The Amazon RDS API allows you to add or remove Identity and Access Management (IAM) role associated with a specific feature name with an RDS database instance. This helps with capabilities such as invoking Lambda functions from within a trigger in the database, load data from Amazon S3 and so on

## __Elastic Load Balancing__
  - ### Features
    - Elastic Load Balancing now supports TLS termination on Network Load Balancers. With this launch, you can offload the decryption/encryption of TLS traffic from your application servers to the Network Load Balancer. This enables you to run your backend servers optimally and keep your workloads secure. Additionally, Network Load Balancers preserve the source IP of the clients to the back-end applications, while terminating TLS on the load balancer. When TLS is enabled on an NLB, Access Logs can be enabled for the load balancer, and log entries will be emitted for all TLS connections.

# __2.3.7__ __2019-01-23__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Added TagOnCreate parameter to the CreateCertificateAuthority operation, updated the Tag regex pattern to align with AWS tagging APIs, and added RevokeCertificate limit.

## __AWS SDK for Java v2__
  - ### Features
    - Redact potentially-sensitive data from the `toString` of service request and response objects.

  - ### Bugfixes
    - Fixed the time marshalling issue when CBOR is disabled. See [#1023](https://github.com/aws/aws-sdk-java-v2/issues/1023)

## __Amazon WorkLink__
  - ### Features
    - This is the initial SDK release for Amazon WorkLink. Amazon WorkLink is a fully managed, cloud-based service that enables secure, one-click access to internal websites and web apps from mobile phones. With Amazon WorkLink, employees can access internal websites as seamlessly as they access any other website. IT administrators can manage users, devices, and domains by enforcing their own security and access policies via the AWS Console or the AWS SDK.

## __AmazonApiGatewayManagementApi__
  - ### Features
    - Fixes a typo in the 'max' constraint.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Add `OneTimeReadTimeoutHanlder` to requests with `expect: 100-continue` header to avoid unexpected `ReadTimeoutException`. See [#954](https://github.com/aws/aws-sdk-java-v2/issues/954)

# __2.3.6__ __2019-01-21__
## __AWS Application Discovery Service__
  - ### Features
    - The Application Discovery Service's import APIs allow you to import information about your on-premises servers and applications into ADS so that you can track the status of your migrations through the Migration Hub console.

## __AWS Database Migration Service__
  - ### Features
    - Update for DMS TestConnectionSucceeds waiter

## __Amazon AppStream__
  - ### Features
    - This API update includes support for tagging Stack, Fleet, and ImageBuilder resources at creation time.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager State Manager now supports configuration management of all AWS resources through integration with Automation.

## __Firewall Management Service__
  - ### Features
    - This release provides support for cleaning up web ACLs during Firewall Management policy deletion. You can now enable the DeleteAllPolicyResources flag and it will delete all system-generated web ACLs.

# __2.3.5__ __2019-01-18__
## __AWS Glue__
  - ### Features
    - AllocatedCapacity field is being deprecated and replaced with MaxCapacity field

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adjust EC2's available instance types.

# __2.3.4__ __2019-01-17__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

## __Amazon Lightsail__
  - ### Features
    - This release adds functionality to the CreateDiskSnapshot API that allows users to snapshot instance root volumes. It also adds various documentation updates.

## __Amazon Pinpoint__
  - ### Features
    - This release updates the PutEvents operation. AppPackageName, AppTitle, AppVersionCode, SdkName fields will now be accepted as a part of the event when submitting events.

## __Amazon Rekognition__
  - ### Features
    - GetLabelDetection now returns bounding box information for common objects and a hierarchical taxonomy of detected labels. The version of the model used for video label detection is also returned. DetectModerationLabels now returns the version of the model used for detecting unsafe content.

# __2.3.3__ __2019-01-16__
## __AWS Backup__
  - ### Features
    - AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and auditing

## __AWS Cost Explorer Service__
  - ### Features
    - Removed Tags from the list of GroupBy dimensions available for GetReservationCoverage.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now integrates with AWS Backup, a centralized backup service that makes it easy for customers to configure and audit the AWS resources they want to backup, automate backup scheduling, set retention policies, and monitor all recent backup and restore activity. AWS Backup provides a fully managed, policy-based backup solution, simplifying your backup management, and helping you meet your business and regulatory backup compliance requirements. For more information, see the Amazon DynamoDB Developer Guide.

## __URLConnection HTTP Client__
  - ### Bugfixes
    - Fix NullPointer of AbortableInputStream delegate if there is no body within UrlConnectionHttpClient

# __2.3.2__ __2019-01-14__
## __AWS Elemental MediaConvert__
  - ### Features
    - IMF decode from a Composition Playlist for IMF specializations App [#2](https://github.com/aws/aws-sdk-java-v2/issues/2) and App [#2](https://github.com/aws/aws-sdk-java-v2/issues/2)e; up to 99 input clippings; caption channel selection for MXF; and updated rate control for CBR jobs. Added support for acceleration in preview

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fixed the bug where query parameters are incorrectly moved to body in async clients. See [#958](https://github.com/aws/aws-sdk-java-v2/issues/958)

## __AWS Storage Gateway__
  - ### Features
    - JoinDomain API supports two more parameters: organizational unit(OU) and domain controllers. Two new APIs are introduced: DetachVolume and AttachVolume.

# __2.3.1__ __2019-01-11__
## __AWS RDS DataService__
  - ### Features
    - Documentation updates for RDS Data API.

## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

## __Amazon Elastic MapReduce__
  - ### Features
    - Documentation updates for Amazon EMR

# __2.3.0__ __2019-01-09__
## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

  - ### Bugfixes
    - ChecksumValidatingPublisher deals with any packetization of the incoming data. See https://github.com/aws/aws-sdk-java-v2/issues/965
    - Fix an issue where dates were being unmarshalled incorrectly for the CBOR protocol used by Amazon Kinesis.
    - Make default `asyncFutureCompletionExeuctor` a true multi-threads executor. See [#968](https://github.com/aws/aws-sdk-java-v2/issues/968)

## __AWS STS__
  - ### Bugfixes
    - Changed the region resolution logic for `role_arn`-based profiles: 1. Check for a `region` property in the same profile as the `role_arn` definition. 2. Check the default region chain. 3. Fall back to the global endpoint and `us-east-1` signing. Fixes [#988](https://github.com/aws/aws-sdk-java-v2/issues/988).

## __Amazon S3__
  - ### Bugfixes
    - Fix `SyncChecksumValidationInterceptor` and `AsyncChecksumValidationInterceptor` to use `long` instead of `int` for contentLength`. See [#963](https://github.com/aws/aws-sdk-java-v2/issues/963)

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Preserve interrupted flag if `Http2MultiplexedChannelPool#close()` interrupted.

## __URLConnection HTTP Client__
  - ### Bugfixes
    - Disable following redirects automatically since doing so causes SDK response handling to fail

## __core__
  - ### Features
    - Jackson 2.9.7 -> 2.9.8

# __2.2.0__ __2018-12-14__
## __AWS SDK for Java v2__
  - ### Features
    - Adds the operation name of the calling API to the ExecutionContext class. This exposes a way to get the API name from within an ExecutionInterceptor.
    - Updated to the latest service models.

## __Amazon S3__
  - ### Bugfixes
    - Modify type of S3Object#size member from integer to long. This is a breaking change for customers who are using the size() method currently
    - S3 putObject API using UrlConnectionHttpClient goes into infinite loop. See https://github.com/aws/aws-sdk-java-v2/pull/942 for more details.

## __Netty NIO HTTP Client__
  - ### Bugfixes
    - Fix a bug where it's possible for an HTTP2 channel pool to be closed while some channels are still being released causing them to be left open and leaked.

## __URLConnection HTTP Client__
  - ### Features
    - Adding a hook to enable custom creation of the initial `HttpURLConnection`. This enables customers to control how a connection is established for a given `URL` including handling any required proxy configuration etc.

# __2.1.4__ __2018-12-07__
## __AWS CodeDeploy__
  - ### Features
    - Supporting AWS CodeDeploy

## __AWS SDK for Java v2__
  - ### Features
    - Add `modifyException` API to `ExecutionInterceptor`.
    - Add application/gzip mime type
    - Update spot bugs version to 3.1.9
    - Updated to the latest service models.

  - ### Bugfixes
    - Fix infinite stream of results bug in auto paginator APIs when the next token is an empty string
    - Fixes nullpointerexception when server responds with null values in map.
    - Use the class loader that loaded the SDK to load the HTTP implementations. See [#56](https://github.com/aws/aws-sdk-java-v2/issues/56)

## __Amazon S3__
  - ### Bugfixes
    - Turns off trailing checksums when using SSE-C or SSE-KMS
    - Update S3 headObject/headBucket operations to throw NoSuchKey/NoSuchException when S3 is returning 404. See [#123](https://github.com/aws/aws-sdk-java-v2/issues/123), [#544](https://github.com/aws/aws-sdk-java-v2/issues/544)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Close created `ChannelPool`s in `close()` method.
    - Fix the issue where streaming requests with `Expect: 100-continue` header sometimes are hanging because 100Continue response message is not being read automatically. See [#459](https://github.com/aws/aws-sdk-java-v2/issues/459)

## __core__
  - ### Features
    - Netty 4.1.32.Final

# __2.1.3__ __2018-11-29__
## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

# __2.1.2__ __2018-11-28__
## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.

## __core__
  - ### Features
    - Jackson 2.9.6 -> 2.9.7

# __2.1.1__ __2018-11-27__
## __AWS Organizations__
  - ### Bugfixes
    - Add `organizations` to `aws-sdk-java` module.

## __AWS SDK for Java V2__
  - ### Bugfixes
    - Fixes Issue [#864](https://github.com/aws/aws-sdk-java-v2/issues/864) by checking for embedded JSON objects while unmarshalling bytes.

## __AWS SDK for Java v2__
  - ### Features
    - Updated to the latest service models.
    - Updated to the latest service models.

  - ### Bugfixes
    - Fix async pagination javadocs to use the correct method name `SdkPublisher#subscribe`.
    - Fixed an issue where close() and abort() weren't being honored for streaming responses in all cases.
    - Preserve computedChecksum in `ChecksumValidatingInputStream` so that it doesn't throw error if it validates more than once. See [#873](https://github.com/aws/aws-sdk-java-v2/issues/873)

# __2.1.0__ __2018-11-19__
## __AWS SDK for Java v2__
  - ### Features
    - AWS SDK for Java v2 is generally available now. To get started, please see this [blog post](https://aws.amazon.com/blogs/developer/aws-sdk-for-java-2-x-released/).
    - Update Netty version to Netty 4.1.31.Final

  - ### Bugfixes
    - Temporarily removed OSGi support because the Netty HTTP client does not yet support it. See [#726](https://github.com/aws/aws-sdk-java-v2/issues/726)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Not invoke fireExceptionCaught if the channel is not active. see [#452](https://github.com/aws/aws-sdk-java-v2/issues/452)

# __2.0.0-preview-13__ __2018-11-13__
## __AWS SDK for Java v2__
  - ### Features
    - Add `Automatic-Module-Name` manifest entry.
    - Add `AwsResponseMetadata` support to allow users to retrieve metadata information such as `requestId`, `extendedRequestId` from the response. see [#670](https://github.com/aws/aws-sdk-java-v2/issues/670)
    - Add apiCallTimeout and apiCallAttemptTimeout feature for synchronous calls.
    - Guava 23.0 -> 26.0
    - upgrade maven-bundle-plugin -> 4.0.0

  - ### Bugfixes
    - Attach `SdkHttpResponse` to the responses of event streaming operations.

## __AWS Security Token Service__
  - ### Features
    - Added supplier functionality to StsAssumeRoleWithSamlCredentialProvider.  This allows for the saml assertion to be refreshed before getting new credentials from STS.

## __AWS Step Function__
  - ### Removals
    - Remove AWS Step Function high level library for now. We will add them in the future.

## __Amazon S3__
  - ### Features
    - Add support for automatically decoding URL-encoded parts of the ListObjects and ListObjectsV2 responses. See https://docs.aws.amazon.com/AmazonS3/latest/API/v2-RESTBucketGET.html and https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGET.html.

  - ### Bugfixes
    - Update S3 `EndpointAddressInterceptor` to honor request protocol.

## __Apache HTTP Client__
  - ### Features
    - Add support for idle connection reaping.

## __core__
  - ### Features
    - Apache HttpClient 4.5.5 -> 4.5.6
    - Netty 4.1.28 -> 4.1.30

# __2.0.0-preview-12__ __2018-09-18__
## __AWS SDK for Java v2__
  - ### Features
    - Add mfa_serial to ProfileProperty
    - Allow clients to add Socket Channel Option
    - Implement apiCallAttemptTimeout and apiCallTimeout feature for asynchrounous calls. Customers can specify timeout via `ClientOverrideConfiguaration.Builder#apiCallTimeout(Duration)` or `RequestOverrideConfiguration.Builder#apiCallAttemptTimeout(Duration)`. Note: this feature is only implemented for asynchrounous api calls.
    - Improve logging for debuggability. see `SdkStandardLogger`.
    - Refactored all services to make module names match the service id from the service model
    - Removed sdk-core dependency from the profiles module. This allows reading from profile files without pulling in the rest of the SDK.
    - Replacing legacy `HttpResponse` with `SdkHttpFullResponse`.
    - Update service models to be current as of 2018-09-07.

  - ### Bugfixes
    - Fix Response Fetcher hasNextPage to check if the output token is non null or non empty if it is a collection or map type. Related to [#677](https://github.com/aws/aws-sdk-java-v2/issues/677)
    - RetryPolicy bug fix: adding throttlingBackoffStrategy to `RetryPolicy.Builder`. see [#646](https://github.com/aws/aws-sdk-java-v2/issues/646)

## __AWS STS__
  - ### Features
    - Add the ability to provide a Supplier<AssumeRoleRequest> to StsAssumeRoleCredentialsProvider

## __Aamazon S3__
  - ### Bugfixes
    - Fix NPE for S3 GET request using http protocol. see [#612](https://github.com/aws/aws-sdk-java-v2/issues/612)

## __Amazon SimpleDB__
  - ### Removals
    - Amazon SimpleDB module is removed from the SDK 2.0. To use SimpleDB, use SDK 1.11.x. Note that you can run SDK 1.11 and 2.0 in the same application.

## __runtime__
  - ### Bugfixes
    - Netty 4.1.26.Final -> 4.1.28.Final

# __2.0.0-preview-11__ __2018-07-30__
## __AWS SDK for Java v2__
  - ### Features
    - Accept `SdkBytes` and `byte[]` instead of `ByteBuffer` in generated setters.
    - Add support to disable EC2 instance metadata service usage via environment variable and system property. [#430](https://github.com/aws/aws-sdk-java-v2/issues/430)
    - Caching `XPathFactory` to improve performance of exception handling for services using XML protocol
    - Exceptions use builders and are immutable.
    - Incorporate the [Reactive Streams Technology Compatibility Kit](https://github.com/reactive-streams/reactive-streams-jvm/tree/master/tck) and ensure current implementations are compliant. [#519](https://github.com/aws/aws-sdk-java-v2/issues/519)
    - Modules (annotations, auth, sdk-core, aws-core, profiles, regions) are refactored under the core module.
    - Refactor signer interfaces to be independent from Amazon/AWS specific classes. Signer interfaces expose a sign method that takes in the request to sign and ExecutionAttributes instance. Parameters needed for signing are to be passed through ExecutionAttributes. SDK signer implementations have overloaded sign methods that can take either generic ExecutionAttributes or modeled params classes as convenience for customers.
    - Region class clean up including the following: - Flattened GovCloud - Renamed `Region.value()` to `Region.id()` - Dropped `get` prefix in the method names. eg: `getRegions()` -> `regions()`
    - Renamed all non-service enums to be singular, not plural.
    - Renaming `SdkBuilder.apply()` -> `SdkBuilder.applyMutation()` and renaming `ResponseTransformer.apply()` to `ResponseTransformer.transform()`.
    - Return `SdkBytes` instead of `ByteBuffer` from generated getters.
    - Update all service models to follow V2 naming convention. eg: `WAFException` -> `WafException`
    - Update service name in clients, requests and exceptions to match 2.0 naming conventions (eg. DynamoDBClient -> DynamoDbClient)
    - Updated `AwsCredentials` to interface implemented by `AwsBasicCredentials` and `AwsSessionCredentials`. Renamed `AwsCredentialsProvider.getCredentials()` to `AwsCredentialsProvider.resolveCredentials()`.
    - Use auto constructed containers for list and map members. [#497](https://github.com/aws/aws-sdk-java-v2/pull/497), [#529](https://github.com/aws/aws-sdk-java-v2/pull/529), [#600](https://github.com/aws/aws-sdk-java-v2/pull/600)
    - Various AsyncClient Refactors:\n - Drop async prefix in `SdkAyncClientBuilder`: `SdkAsyncClientBuilder.asyncHttpClientBuilder() -> SdkAsyncClientBuilder.httpClientBuilder()`\n - Create `SdkEventLoopGroup` to allow users to provide `EventLoopGroup` and `ChannelFactory`.
    - upgrade Netty 4.1.22.Final to Netty 4.1.26.Final

  - ### Deprecations
    - Deprecating `QueryStringSigner` in favor of `Aws4Signer`.

  - ### Removals
    - Make paginators resume method private.(We will re-add the feature in the future)
    - Removing gzipEnabled client configuration.

## __AWS WAF Regional__
  - ### Features
    - AWS Waf Regional clients are now in `software.amazon.awssdk.services.waf.regional` package.

## __Amazon DynamoDB__
  - ### Features
    - Add default DynamoDB specific retry policy.
    - Update DynamoDB default max retry count to 8. Related to [#431](https://github.com/aws/aws-sdk-java-v2/issues/431)

## __Amazon DynamoDB Streams__
  - ### Features
    - Dynamodb Streams clients are now in `software.amazon.awssdk.services.dynamodb.streams` package.

## __Amazon S3__
  - ### Features
    - Move `AWSS3V4Signer` to auth module.

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Fix the Netty async client to stop publishing to the request stream once `Content-Length` is reached.

# __2.0.0-preview-10__ __2018-05-25__
## __AWS SDK for Java v2__
  - ### Features
    - Add [SdkHttpResponse](https://github.com/aws/aws-sdk-java-v2/blob/master/http-client-spi/src/main/java/software/amazon/awssdk/http/SdkHttpResponse.java) to [SdkResponse](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/core/SdkResponse.java) so that customers can retrieve Http data such as headers, status code from the response object.
    - Add a standard User-Agent when making requests to the metadata service.  User-Agent pattern: aws-sdk-java/<version>
    - Added Consumer<Builder>-style methods for all client overloads.
    - Added Consumer<Builder>-style methods for vararg parameters.
    - AsyncResponseTransformer byte array and string methods now match the sync model.
    - Include root causes in the exception message from AWSCredentialsProviderChain to ease troubleshooting.
    - Moved AWS specific retry policies to aws-core module, created AwsServiceException and moved isThrottlingException and isClockSkewException methods to SdkServiceException.
    - Renamed "Bytes" overload for streaming operations to "AsBytes", and "String" overload for enums to "AsString"
    - Renamed AsyncRequestProvider to AsyncRequestBody to better match sync's RequestBody
    - Renamed AsyncResponseHandler to AsyncResponseTransformer and StreamingResponseHandler to ResponseTransformer.
    - Renamed `AdvancedServiceConfiguration` to `ServiceConfiguration`
    - Renamed `RequestOverrideConfig` to `RequestOverrideConfiguration` to match `ClientOverrideConfiguration` naming.
    - Simplified configuration of HTTP clients.
    - Split core module to regions, profiles, auth, aws-core and core modules.[#27](https://github.com/aws/aws-sdk-java-v2/issues/27)
    - Updating default retry policy to include newly added conditions.

  - ### Removals
    - Remove httpRequestTimeout and totalExecutionTimeout features

## __AWS Secrets Manager__
  - ### Features
    - Add AWS Secrets Manager to v2.

## __Amazon S3__
  - ### Features
    - Renamed `S3AdvancedConfiguration` to `S3Configuration`

# __2.0.0-preview-9__ __2018-03-20__
## __AWS Lambda__
  - ### Features
    - Added latest model for new service features.

## __AWS SDK for Java v2__
  - ### Bugfixes
    - Fix default user agent to comply with [RFC 7231](https://tools.ietf.org/html/rfc7231#section-5.5.3). Related to [#80](https://github.com/aws/aws-sdk-java-v2/issues/80)
    - Maven artifact software.amazon.awssdk:bom no longer includes non-SDK dependencies.

# __2.0.0-preview-8__ __2018-02-02__
## __AWS SDK for Java v2__
  - ### Features
    - Added Consumer<Builder> methods to multiple locations where they were previously missing.
    - Added `SdkClient` base interface that all service clients implement.
    - Added and standardized `toString` implementations of public data classes.
    - Adding the following services from re:invent 2017:
       - Alexa For Business
       - AWS Migration Hub
       - AWS Cost Explorer
       - AWS Cloud9
       - AWS CloudHSM V2
       - Amazon Comprehend
       - AWS Glue
       - Amazon GuardDuty
       - Amazon Kinesis Video Streams
       - AWS Elemental MediaConvert
       - AWS Elemental MediaLive
       - AWS Elemental MediaPackage
       - AWS Elemental MediaStore
       - AWS Mobile
       - AmazonMQ
       - AWS Price List
       - AWS Resource Groups
       - Amazon SageMaker
       - AWS Serverless Application Repository
       - Amazon Route 53 Auto Naming
       - Amazon Translate
       - Amazon WorkMail
    - Setting `Content-Type` header for streaming requests. Related to [#357](https://github.com/aws/aws-sdk-java-v2/issues/357)
    - upgrade Netty 4.1.17.Final to 4.1.19.Final

  - ### Bugfixes
    - Fixed issue where error message in S3 exceptions could be "null" if the exception did not have a modeled type.

## __Amazon CloudWatch__
  - ### Features
    - Added pagination configuration to CloudWatch

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Fix race condition in the async client causing instability when making multiple concurent requests. Fixes [#202](https://github.com/aws/aws-sdk-java-v2/issues/202)

# __2.0.0-preview-7__ __2017-12-15__
## __AWS SDK for Java v2__
  - ### Features
    - Added `Bytes` methods to all streaming operations. These methods will load the service response into memory and return a `ResponseBytes` object that eases conversion into other types, like strings. eg. `String object = s3.getObjectBytes(request).asUtf8String()`. [#324](https://github.com/aws/aws-sdk-java-v2/pull/324)
    - Added `ProfileCredentialsProvider.create("profile-name")` helper to `ProfileCredentialsProvider` to account for common use-case where only profile name is provided. [#347](https://github.com/aws/aws-sdk-java-v2/pull/347)
    - Adds convenience type overloads to allow easier to use types on modeled objects. [#336](https://github.com/aws/aws-sdk-java-v2/pull/336)
    - Automatically retry streaming downloads to a file if they fail or are interrupted. [#324](https://github.com/aws/aws-sdk-java-v2/pull/324)
    - Implementation of a generic HTTP credential provider used to get credentials from an container metadata service. Replica of v1 [implementation](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-core/src/main/java/com/amazonaws/auth/ContainerCredentialsProvider.java#L108) [#328](https://github.com/aws/aws-sdk-java-v2/pull/328)
    - Refactors the exceptions used by the SDK. [#301](https://github.com/aws/aws-sdk-java-v2/pull/301)
    - Remove the legacy `AmazonWebServiceRequest`, `AmazonWebServiceResult`, and `AmazonWebServiceResponse` classes. They are replaced with `AwsRequest` and `AwsResponse`. [#289](https://github.com/aws/aws-sdk-java-v2/issues/289)
    - Updated profile-based region and credential loading to more closely mirror the behavior in the AWS CLI. Notably, profile names in `~/.aws/config` must be prefixed with "profile " (except for the default profile) and profile names in `~/.aws/credentials` must not be prefixed with "profile ". [#296](https://github.com/aws/aws-sdk-java-v2/pull/296)
    - Upgrade maven-compiler-plugin from 3.6.0 to 3.7.0
    - Upgraded dependencies
       * Wiremock (com.github.tomakehurst:wiremock) 1.55 -> 2.12.0
       * Json Path (com.jayway.jsonpath:json-path) 2.2.0 -> 2.4.0
    - upgrade to Jackson 2.9.3

  - ### Removals
    - Remove easymock as a dependency, mockito should be used for all mocking going forward. [#348](https://github.com/aws/aws-sdk-java-v2/pull/348)
    - Removed the following unused dependencies [#349](https://github.com/aws/aws-sdk-java-v2/issues/349):
       * org.eclipse:text
       * info.cukes:cucumber-java
       * info.cukes:cucumber-junit
       * info.cukes:cucumber-guice
       * com.google.inject:guice
       * org.bouncycastle:bcprov-jdk15on
       * com.google.guava:guava
       * io.burt:jmespath-jackson
       * javax.annotation:javax.annotation-api

## __Amazon S3__
  - ### Bugfixes
    - Fixing exception unmarshalling for S3. [#297](https://github.com/aws/aws-sdk-java-v2/issues/297)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Fixes Issue [#340](https://github.com/aws/aws-sdk-java-v2/issues/340) where connection acquisition time was calculated incorrectly in the Netty client.

# __2.0.0-preview-6__ __2017-12-06__
## __AWS AppSync__
  - ### Features
    - Adding AWS AppSync based on customer request. [#318](https://github.com/aws/aws-sdk-java-v2/pull/318)

## __AWS Lambda__
  - ### Removals
    - Removed high-level utilities. [#247](https://github.com/aws/aws-sdk-java-v2/pull/247)

## __AWS SDK for Java v2__
  - ### Features
    - Add paginators-1.json file for some services [#298](https://github.com/aws/aws-sdk-java-v2/pull/298)
    - Added a primitive `Waiter` class for simplifying poll-until-condition-is-met behavior. [#300](https://github.com/aws/aws-sdk-java-v2/pull/300)
    - Adding Consumer<Builder> to overrideConfiguration on ClientBuilder [#291](https://github.com/aws/aws-sdk-java-v2/pull/291)
    - Adding helper to Either that allows construction from two possibly null values [#292](https://github.com/aws/aws-sdk-java-v2/pull/292)
    - Adding knownValues static to enum generation [#218](https://github.com/aws/aws-sdk-java-v2/pull/218)
    - Adding validation to Region class [#261](https://github.com/aws/aws-sdk-java-v2/pull/261)
    - Converted all wiremock tests to run as part of the build. [#260](https://github.com/aws/aws-sdk-java-v2/pull/260)
    - Enhanced pagination for synchronous clients[#207](https://github.com/aws/aws-sdk-java-v2/pull/207)
    - Implementing Consumer<Builder> fluent setter pattern on client operations [#280](https://github.com/aws/aws-sdk-java-v2/pull/280)
    - Implementing Consumer<Builder> fluent setters pattern on model builders. [#278](https://github.com/aws/aws-sdk-java-v2/pull/278)
    - Making it easier to supply async http configuration. [#274](https://github.com/aws/aws-sdk-java-v2/pull/274)
    - Refactoring retry logic out to separate class [#177](https://github.com/aws/aws-sdk-java-v2/pull/177)
    - Removing unnecessary javax.mail dependency [#312](https://github.com/aws/aws-sdk-java-v2/pull/312)
    - Replacing constructors with static factory methods [#284](https://github.com/aws/aws-sdk-java-v2/pull/284)
    - Retry policy refactor [#190](https://github.com/aws/aws-sdk-java-v2/pull/190)
    - Update latest models for existing services [#299](https://github.com/aws/aws-sdk-java-v2/pull/299)
    - Upgrade dependencies to support future migration to Java 9. [#271](https://github.com/aws/aws-sdk-java-v2/pull/271)
    - Upgraded dependencies:
      * javapoet 1.8.0 -> 1.9.0 [#311](https://github.com/aws/aws-sdk-java-v2/pull/311)
      * Apache HttpClient 4.5.2 -> 4.5.4 [#308](https://{github.com/aws/aws-sdk-java-v2/pull/308)
      * Jackson 2.9.1 -> 2.9.2 [#310](https://github.com/aws/aws-sdk-java-v2/pull/310)
      * Netty 4.1.13 -> 4.1.17 [#309](https://github.com/{aws/aws-sdk-java-v2/pull/309)
    - Use java.util.Objects to implement equals, hashCode [#294](https://github.com/aws/aws-sdk-java-v2/pull/294)

  - ### Bugfixes
    - Attempting to fix class-loader exception raised on gitter. [#216](https://github.com/aws/aws-sdk-java-v2/pull/216)
    - Call doClose in HttpClientDependencies#close method [#268](https://github.com/aws/aws-sdk-java-v2/pull/268)
    - Fixing bundle exports [#281](https://github.com/aws/aws-sdk-java-v2/pull/281)

  - ### Removals
    - Delete old jmespath AST script [#266](https://github.com/aws/aws-sdk-java-v2/pull/266)
    - Remove current waiter implementation. [#258](https://github.com/aws/aws-sdk-java-v2/pull/258)
    - Removed policy builder. [#259](https://github.com/aws/aws-sdk-java-v2/pull/259)
    - Removed progress listeners until they can be updated to V2 standards. [#285](https://github.com/aws/aws-sdk-java-v2/pull/285)

## __Amazon CloudFront__
  - ### Removals
    - Removed high-level cloudfront utilities. [#242](https://github.com/aws/aws-sdk-java-v2/pull/242)

## __Amazon DynamoDB__
  - ### Features
    - Adding some helpers for being able to create DyanmoDB AttributeValues. [#276](https://github.com/aws/aws-sdk-java-v2/pull/276)

  - ### Bugfixes
    - Fixed TableUtils that broke with enum change. [#235](https://github.com/aws/aws-sdk-java-v2/pull/235)

## __Amazon EC2__
  - ### Removals
    - Removed high-level utilities. [#244](https://github.com/aws/aws-sdk-java-v2/pull/244)

## __Amazon EMR__
  - ### Removals
    - Removed high-level utilities. [#245](https://github.com/aws/aws-sdk-java-v2/pull/245)

## __Amazon Glacier__
  - ### Removals
    - Removed high-level utilities. [#246](https://github.com/aws/aws-sdk-java-v2/pull/246)

## __Amazon Polly__
  - ### Removals
    - Removed polly presigners until they can be updated for V2. [#287](https://github.com/aws/aws-sdk-java-v2/pull/287)

## __Amazon S3__
  - ### Features
    - Adding utility that creates temporary bucket name using user-name  [#234](https://github.com/aws/aws-sdk-java-v2/pull/234)

## __Amazon SES__
  - ### Removals
    - Removed high-level utilities. [#248](https://github.com/aws/aws-sdk-java-v2/pull/248)

## __Amazon SNS__
  - ### Removals
    - Removed high-level utilities. [#255](https://github.com/aws/aws-sdk-java-v2/pull/255)

## __Amazon SQS__
  - ### Bugfixes
    - Porting SQS test to make use of async and hopefully resolve the bug [#240](https://github.com/aws/aws-sdk-java-v2/pull/240)

  - ### Removals
    - Removed high-level utilities and the interceptor that rewrites the endpoint based on the SQS queue. [#238](https://github.com/aws/aws-sdk-java-v2/pull/238)

## __Amazon SimpleDB__
  - ### Removals
    - Removed high-level utilities and unused response metadata handler. [#249](https://github.com/aws/aws-sdk-java-v2/pull/249)

## __Netty NIO Async HTTP Client__
  - ### Features
    - Adding socket resolver helper that will load the appropriate SocketChannel [#293](https://github.com/aws/aws-sdk-java-v2/pull/293)

  - ### Bugfixes
    - Netty spurious timeout error fix [#283](https://github.com/aws/aws-sdk-java-v2/pull/283)
    - Temporarily disable epoll [#254](https://github.com/aws/aws-sdk-java-v2/pull/254)

# __2.0.0-preview-5__ __2017-10-17__
## __AWS SDK for Java v2__
  - ### Features
    - Asynchronous request handler for strings `AsyncRequestProvider.fromString("hello world!!!")` [PR #183](https://github.com/aws/aws-sdk-java-v2/pull/183)
    - General HTTP core clean-up [PR #178](https://github.com/aws/aws-sdk-java-v2/pull/178)
    - Get value from request POJO using member model names `String bucketName = s3PutObjectResponse.getValueForField("Bucket", String.class);` [PR #144](https://github.com/aws/aws-sdk-java-v2/pull/144)
    - Model enums on service POJOs [PR #195](https://github.com/aws/aws-sdk-java-v2/pull/195)
    - Move `core` classes to their own package `software.amazon.awssdk.core` [PR #194](https://github.com/aws/aws-sdk-java-v2/pull/194)

  - ### Bugfixes
    - Resolve potential security issue handling DTD entities [PR #198](https://github.com/aws/aws-sdk-java-v2/pull/198)
    - Serialization/deserialization of complex model objects [PR #128](https://github.com/aws/aws-sdk-java-v2/pull/128) / [Issue #121](https://github.com/aws/aws-sdk-java-v2/issues/121)

## __Amazon S3__
  - ### Features
    - Handle 100-continue header for PUT object [PR #169](https://github.com/aws/aws-sdk-java-v2/pull/169)

## __Netty NIO Async HTTP Client__
  - ### Bugfixes
    - Better handling of event-loop selection for AWS Lambda container [PR #208](https://github.com/aws/aws-sdk-java-v2/pull/208)
    - Data corruption fix in streaming responses and stability fixes [PR #173](https://github.com/aws/aws-sdk-java-v2/pull/173)

# __2.0.0-preview-4__ __2017-09-19__
## __AWS SDK for Java v2__
  - ### Features
    - Added convenience methods for both sync and async streaming operations for file based uploads/downloads.
    - Added some convenience implementation of [AsyncResponseHandler](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/async/AsyncResponseHandler.java) to emit to a byte array or String.
    - Immutable objects can now be modified easily with a newly introduced [copy](https://github.com/aws/aws-sdk-java-v2/blob/master/utils/src/main/java/software/amazon/awssdk/utils/builder/ToCopyableBuilder.java#L42) method that applies a transformation on the builder for the object and returns a new immutable object.
    - Major refactor of RequestHandler interfaces. Newly introduced [ExecutionInterceptors](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/interceptor/ExecutionInterceptor.java) have a cleaner, more consistent API and are much more powerful.
    - S3's CreateBucket no longer requires the location constraint to be specified, it will be inferred from the client region if not present.
    - The [File](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/sync/StreamingResponseHandler.java#L92) and [OutputStream](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/sync/StreamingResponseHandler.java#L107) implementations of StreamingResponseHandler now return the POJO response in onComplete.

  - ### Bugfixes
    - Fixed a bug in default credential provider chain where it would erroneously abort at the ProfileCredentialsProvider. See [Issue #135](https://github.com/aws/aws-sdk-java-v2/issues/135)
    - Many improvements and fixes to the Netty NIO based transport.
    - Several fixes around S3's endpoint resolution, particularly with advanced options like path style addressing and accelerate mode. See [Issue #130](https://github.com/aws/aws-sdk-java-v2/issues/130)
    - Several fixes around serialization and deserialization of immutable objects. See [Issue #122](https://github.com/aws/aws-sdk-java-v2/issues/122)
    - Type parameters are now correctly included for [StreamingResponseHandler](https://github.com/aws/aws-sdk-java-v2/blob/master/core/src/main/java/software/amazon/awssdk/sync/StreamingResponseHandler.java) on the client interface.

  - ### Removals
    - Dependency on JodaTime has been dropped in favor of Java 8's APIS.
    - DynamoDBMapper and DynamoDB Document API have been removed.
    - Metrics subsystem has been removed.

# __2.0.0-preview-2__ __2017-07-21__
## __AWS SDK for Java v2__
  - ### Features
    - New pluggable HTTP implementation built on top of Java's HttpUrlConnection. Good choice for simple applications with low throughput requirements. Better cold start latency than the default Apache implementation.
    - Simple convenience methods have been added for operations that require no input parameters.
    - Substantial improvements to start up time and cold start latencies
    - The Netty NIO HTTP client now uses a shared event loop group for better resource management. More options for customizing the event loop group are now available.
    - Using java.time instead of the legacy java.util.Date in generated model classes.
    - Various improvements to the immutability of model POJOs. ByteBuffers are now copied and collections are returned as unmodifiable.

# __2.0.0-preview-1__ __2017-06-28__
## __AWS SDK for Java v2__
  - ### Features
    - Initial release of the AWS SDK for Java v2. See our [blog post](https://aws.amazon.com/blogs/developer/aws-sdk-for-java-2-0-developer-preview) for information about this new major veresion. This release is considered a developer preview and is not intended for production use cases.

