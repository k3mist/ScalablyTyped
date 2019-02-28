package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/batch", "Batch")
@js.native
object BatchNs extends js.Object {
  trait ArrayJobStatusSummary
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Integer]
  
  trait ArrayProperties extends js.Object {
    /**
      * The size of the array job.
      */
    var size: js.UndefOr[Integer] = js.undefined
  }
  
  trait ArrayPropertiesDetail extends js.Object {
    /**
      * The job index within the array that is associated with this job. This parameter is returned for array job children.
      */
    var index: js.UndefOr[Integer] = js.undefined
    /**
      * The size of the array job. This parameter is returned for parent array jobs.
      */
    var size: js.UndefOr[Integer] = js.undefined
    /**
      * A summary of the number of array job children in each available job status. This parameter is returned for parent array jobs.
      */
    var statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.undefined
  }
  
  trait ArrayPropertiesSummary extends js.Object {
    /**
      * The job index within the array that is associated with this job. This parameter is returned for children of array jobs.
      */
    var index: js.UndefOr[Integer] = js.undefined
    /**
      * The size of the array job. This parameter is returned for parent array jobs.
      */
    var size: js.UndefOr[Integer] = js.undefined
  }
  
  trait AttemptContainerDetail extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon ECS container instance that hosts the job attempt.
      */
    var containerInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The exit code for the job attempt. A non-zero exit code is considered a failure.
      */
    var exitCode: js.UndefOr[Integer] = js.undefined
    /**
      * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
      */
    var logStreamName: js.UndefOr[String] = js.undefined
    /**
      * The network interfaces associated with the job attempt.
      */
    var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
    /**
      * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
      */
    var reason: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the job attempt. Each container attempt receives a task ARN when they reach the STARTING status.
      */
    var taskArn: js.UndefOr[String] = js.undefined
  }
  
  trait AttemptDetail extends js.Object {
    /**
      * Details about the container in this job attempt.
      */
    var container: js.UndefOr[AttemptContainerDetail] = js.undefined
    /**
      * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned from the STARTING state to the RUNNING state).
      */
    var startedAt: js.UndefOr[Long] = js.undefined
    /**
      * A short, human-readable string to provide additional details about the current status of the job attempt.
      */
    var statusReason: js.UndefOr[String] = js.undefined
    /**
      * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
      */
    var stoppedAt: js.UndefOr[Long] = js.undefined
  }
  
  trait CancelJobRequest extends js.Object {
    /**
      * The AWS Batch job ID of the job to cancel.
      */
    var jobId: String
    /**
      * A message to attach to the job that explains the reason for canceling it. This message is returned by future DescribeJobs operations on the job. This message is also recorded in the AWS Batch activity logs. 
      */
    var reason: String
  }
  
  trait CancelJobResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ComputeEnvironmentDetail extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the compute environment. 
      */
    var computeEnvironmentArn: String
    /**
      * The name of the compute environment. 
      */
    var computeEnvironmentName: String
    /**
      * The compute resources defined for the compute environment. 
      */
    var computeResources: js.UndefOr[ComputeResource] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment. 
      */
    var ecsClusterArn: String
    /**
      * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API operations on your behalf.
      */
    var serviceRole: js.UndefOr[String] = js.undefined
    /**
      * The state of the compute environment. The valid values are ENABLED or DISABLED.  If the state is ENABLED, then the AWS Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the AWS Batch scheduler does not attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state do not scale out. However, they scale in to minvCpus value after instances become idle.
      */
    var state: js.UndefOr[CEState] = js.undefined
    /**
      * The current status of the compute environment (for example, CREATING or VALID).
      */
    var status: js.UndefOr[CEStatus] = js.undefined
    /**
      * A short, human-readable string to provide additional details about the current status of the compute environment.
      */
    var statusReason: js.UndefOr[String] = js.undefined
    /**
      * The type of the compute environment.
      */
    var `type`: js.UndefOr[CEType] = js.undefined
  }
  
  trait ComputeEnvironmentOrder extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the compute environment.
      */
    var computeEnvironment: String
    /**
      * The order of the compute environment.
      */
    var order: Integer
  }
  
  trait ComputeResource extends js.Object {
    /**
      * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest (market) price and never more than your maximum percentage. If you leave this field empty, the default value is 100% of the On-Demand price.
      */
    var bidPercentage: js.UndefOr[Integer] = js.undefined
    /**
      * The desired number of EC2 vCPUS in the compute environment. 
      */
    var desiredvCpus: js.UndefOr[Integer] = js.undefined
    /**
      * The EC2 key pair that is used for instances launched in the compute environment.
      */
    var ec2KeyPair: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
      */
    var imageId: js.UndefOr[String] = js.undefined
    /**
      * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example, ecsInstanceRole or arn:aws:iam::&lt;aws_account_id&gt;:instance-profile/ecsInstanceRole. For more information, see Amazon ECS Instance Role in the AWS Batch User Guide.
      */
    var instanceRole: String
    /**
      * The instances types that may be launched. You can specify instance families to launch any instance type within those families (for example, c4 or p3), or you can specify specific sizes within a family (such as c4.8xlarge). You can also choose optimal to pick instance types (from the latest C, M, and R instance families) on the fly that match the demand of your job queues.
      */
    var instanceTypes: StringList
    /**
      * The launch template to use for your compute resources. Any other compute resource parameters that you specify in a CreateComputeEnvironment API operation override the same parameters in the launch template. You must specify either the launch template ID or launch template name in the request, but not both. 
      */
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
      * The maximum number of EC2 vCPUs that an environment can reach. 
      */
    var maxvCpus: Integer
    /**
      * The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is DISABLED). 
      */
    var minvCpus: Integer
    /**
      * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node parallel jobs to your compute environment, you should consider creating a cluster placement group and associate it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within a single Availability Zone with high network flow potential. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
      */
    var placementGroup: js.UndefOr[String] = js.undefined
    /**
      * The EC2 security group that is associated with instances launched in the compute environment. 
      */
    var securityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment.
      */
    var spotIamFleetRole: js.UndefOr[String] = js.undefined
    /**
      * The VPC subnets into which the compute resources are launched. 
      */
    var subnets: StringList
    /**
      * Key-value pair tags to be applied to resources that are launched in the compute environment. 
      */
    var tags: js.UndefOr[TagsMap] = js.undefined
    /**
      * The type of compute environment.
      */
    var `type`: CRType
  }
  
  trait ComputeResourceUpdate extends js.Object {
    /**
      * The desired number of EC2 vCPUS in the compute environment.
      */
    var desiredvCpus: js.UndefOr[Integer] = js.undefined
    /**
      * The maximum number of EC2 vCPUs that an environment can reach.
      */
    var maxvCpus: js.UndefOr[Integer] = js.undefined
    /**
      * The minimum number of EC2 vCPUs that an environment should maintain.
      */
    var minvCpus: js.UndefOr[Integer] = js.undefined
  }
  
  trait ContainerDetail extends js.Object {
    /**
      * The command that is passed to the container. 
      */
    var command: js.UndefOr[StringList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the container instance on which the container is running.
      */
    var containerInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The environment variables to pass to a container.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
      */
    var environment: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
      * The exit code to return upon completion.
      */
    var exitCode: js.UndefOr[Integer] = js.undefined
    /**
      * The image used to start the container.
      */
    var image: js.UndefOr[String] = js.undefined
    /**
      * The instance type of the underlying host infrastructure of a multi-node parallel job.
      */
    var instanceType: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) associated with the job upon execution. 
      */
    var jobRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
      */
    var logStreamName: js.UndefOr[String] = js.undefined
    /**
      * The number of MiB of memory reserved for the job.
      */
    var memory: js.UndefOr[Integer] = js.undefined
    /**
      * The mount points for data volumes in your container.
      */
    var mountPoints: js.UndefOr[MountPoints] = js.undefined
    /**
      * The network interfaces associated with the job.
      */
    var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
    /**
      * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user).
      */
    var privileged: js.UndefOr[Boolean] = js.undefined
    /**
      * When this parameter is true, the container is given read-only access to its root file system.
      */
    var readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
    /**
      * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
      */
    var reason: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container attempt receives a task ARN when they reach the STARTING status.
      */
    var taskArn: js.UndefOr[String] = js.undefined
    /**
      * A list of ulimit values to set in the container.
      */
    var ulimits: js.UndefOr[Ulimits] = js.undefined
    /**
      * The user name to use inside the container.
      */
    var user: js.UndefOr[String] = js.undefined
    /**
      * The number of VCPUs allocated for the job. 
      */
    var vcpus: js.UndefOr[Integer] = js.undefined
    /**
      * A list of volumes associated with the job.
      */
    var volumes: js.UndefOr[Volumes] = js.undefined
  }
  
  trait ContainerOverrides extends js.Object {
    /**
      * The command to send to the container that overrides the default command from the Docker image or the job definition.
      */
    var command: js.UndefOr[StringList] = js.undefined
    /**
      * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the job definition.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
      */
    var environment: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
      * The instance type to use for a multi-node parallel job. This parameter is not valid for single-node container jobs.
      */
    var instanceType: js.UndefOr[String] = js.undefined
    /**
      * The number of MiB of memory reserved for the job. This value overrides the value set in the job definition.
      */
    var memory: js.UndefOr[Integer] = js.undefined
    /**
      * The number of vCPUs to reserve for the container. This value overrides the value set in the job definition.
      */
    var vcpus: js.UndefOr[Integer] = js.undefined
  }
  
  trait ContainerProperties extends js.Object {
    /**
      * The command that is passed to the container. This parameter maps to Cmd in the Create a container section of the Docker Remote API and the COMMAND parameter to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#cmd.
      */
    var command: js.UndefOr[StringList] = js.undefined
    /**
      * The environment variables to pass to a container. This parameter maps to Env in the Create a container section of the Docker Remote API and the --env option to docker run.  We do not recommend using plaintext environment variables for sensitive information, such as credential data.   Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
      */
    var environment: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
      * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker Hub registry are available by default. Other repositories are specified with  repository-url/image:tag . Up to 255 letters (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter maps to Image in the Create a container section of the Docker Remote API and the IMAGE parameter of docker run.   Images in Amazon ECR repositories use the full registry and repository URI (for example, 012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;).    Images in official repositories on Docker Hub use a single name (for example, ubuntu or mongo).   Images in other repositories on Docker Hub are qualified with an organization name (for example, amazon/amazon-ecs-agent).   Images in other online repositories are qualified further by a domain name (for example, quay.io/assemblyline/ubuntu).  
      */
    var image: js.UndefOr[String] = js.undefined
    /**
      * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job must use the same instance type. This parameter is not valid for single-node container jobs.
      */
    var instanceType: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
      */
    var jobRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed. This parameter maps to Memory in the Create a container section of the Docker Remote API and the --memory option to docker run. You must specify at least 4 MiB of memory for a job.  If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a particular instance type, see Memory Management in the AWS Batch User Guide. 
      */
    var memory: js.UndefOr[Integer] = js.undefined
    /**
      * The mount points for data volumes in your container. This parameter maps to Volumes in the Create a container section of the Docker Remote API and the --volume option to docker run.
      */
    var mountPoints: js.UndefOr[MountPoints] = js.undefined
    /**
      * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). This parameter maps to Privileged in the Create a container section of the Docker Remote API and the --privileged option to docker run.
      */
    var privileged: js.UndefOr[Boolean] = js.undefined
    /**
      * When this parameter is true, the container is given read-only access to its root file system. This parameter maps to ReadonlyRootfs in the Create a container section of the Docker Remote API and the --read-only option to docker run.
      */
    var readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of ulimits to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run.
      */
    var ulimits: js.UndefOr[Ulimits] = js.undefined
    /**
      * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run.
      */
    var user: js.UndefOr[String] = js.undefined
    /**
      * The number of vCPUs reserved for the container. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
      */
    var vcpus: js.UndefOr[Integer] = js.undefined
    /**
      * A list of data volumes used in a job.
      */
    var volumes: js.UndefOr[Volumes] = js.undefined
  }
  
  trait ContainerSummary extends js.Object {
    /**
      * The exit code to return upon completion.
      */
    var exitCode: js.UndefOr[Integer] = js.undefined
    /**
      * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
      */
    var reason: js.UndefOr[String] = js.undefined
  }
  
  trait CreateComputeEnvironmentRequest extends js.Object {
    /**
      * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
      */
    var computeEnvironmentName: String
    /**
      * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments.
      */
    var computeResources: js.UndefOr[ComputeResource] = js.undefined
    /**
      * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf. If your specified role has a path other than /, then you must either specify the full role ARN (this is recommended) or prefix the role name with the path.  Depending on how you created your AWS Batch service role, its ARN may contain the service-role path prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
      */
    var serviceRole: String
    /**
      * The state of the compute environment. If the state is ENABLED, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
      */
    var state: js.UndefOr[CEState] = js.undefined
    /**
      * The type of the compute environment. For more information, see Compute Environments in the AWS Batch User Guide.
      */
    var `type`: CEType
  }
  
  trait CreateComputeEnvironmentResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the compute environment. 
      */
    var computeEnvironmentArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the compute environment.
      */
    var computeEnvironmentName: js.UndefOr[String] = js.undefined
  }
  
  trait CreateJobQueueRequest extends js.Object {
    /**
      * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment should execute a given job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue.
      */
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    /**
      * The name of the job queue.
      */
    var jobQueueName: String
    /**
      * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
      */
    var priority: Integer
    /**
      * The state of the job queue. If the job queue state is ENABLED, it is able to accept jobs.
      */
    var state: js.UndefOr[JQState] = js.undefined
  }
  
  trait CreateJobQueueResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the job queue.
      */
    var jobQueueArn: String
    /**
      * The name of the job queue.
      */
    var jobQueueName: String
  }
  
  trait DeleteComputeEnvironmentRequest extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the compute environment to delete. 
      */
    var computeEnvironment: String
  }
  
  trait DeleteComputeEnvironmentResponse extends js.Object
  
  trait DeleteJobQueueRequest extends js.Object {
    /**
      * The short name or full Amazon Resource Name (ARN) of the queue to delete. 
      */
    var jobQueue: String
  }
  
  trait DeleteJobQueueResponse extends js.Object
  
  trait DeregisterJobDefinitionRequest extends js.Object {
    /**
      * The name and revision (name:revision) or full Amazon Resource Name (ARN) of the job definition to deregister. 
      */
    var jobDefinition: String
  }
  
  trait DeregisterJobDefinitionResponse extends js.Object
  
  trait DescribeComputeEnvironmentsRequest extends js.Object {
    /**
      * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries. 
      */
    var computeEnvironments: js.UndefOr[StringList] = js.undefined
    /**
      * The maximum number of cluster results returned by DescribeComputeEnvironments in paginated output. When this parameter is used, DescribeComputeEnvironments only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeComputeEnvironments request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeComputeEnvironments returns up to 100 results and a nextToken value if applicable.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The nextToken value returned from a previous paginated DescribeComputeEnvironments request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeComputeEnvironmentsResponse extends js.Object {
    /**
      * The list of compute environments.
      */
    var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.undefined
    /**
      * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeJobDefinitionsRequest extends js.Object {
    /**
      * The name of the job definition to describe.
      */
    var jobDefinitionName: js.UndefOr[String] = js.undefined
    /**
      * A space-separated list of up to 100 job definition names or full Amazon Resource Name (ARN) entries.
      */
    var jobDefinitions: js.UndefOr[StringList] = js.undefined
    /**
      * The maximum number of results returned by DescribeJobDefinitions in paginated output. When this parameter is used, DescribeJobDefinitions only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobDefinitions request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeJobDefinitions returns up to 100 results and a nextToken value if applicable.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The nextToken value returned from a previous paginated DescribeJobDefinitions request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The status with which to filter job definitions.
      */
    var status: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeJobDefinitionsResponse extends js.Object {
    /**
      * The list of job definitions. 
      */
    var jobDefinitions: js.UndefOr[JobDefinitionList] = js.undefined
    /**
      * The nextToken value to include in a future DescribeJobDefinitions request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeJobQueuesRequest extends js.Object {
    /**
      * A list of up to 100 queue names or full queue Amazon Resource Name (ARN) entries.
      */
    var jobQueues: js.UndefOr[StringList] = js.undefined
    /**
      * The maximum number of results returned by DescribeJobQueues in paginated output. When this parameter is used, DescribeJobQueues only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobQueues request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeJobQueues returns up to 100 results and a nextToken value if applicable.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The nextToken value returned from a previous paginated DescribeJobQueues request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeJobQueuesResponse extends js.Object {
    /**
      * The list of job queues. 
      */
    var jobQueues: js.UndefOr[JobQueueDetailList] = js.undefined
    /**
      * The nextToken value to include in a future DescribeJobQueues request. When the results of a DescribeJobQueues request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeJobsRequest extends js.Object {
    /**
      * A space-separated list of up to 100 job IDs.
      */
    var jobs: StringList
  }
  
  trait DescribeJobsResponse extends js.Object {
    /**
      * The list of jobs. 
      */
    var jobs: js.UndefOr[JobDetailList] = js.undefined
  }
  
  trait Host extends js.Object {
    /**
      * The path on the host container instance that is presented to the container. If this parameter is empty, then the Docker daemon has assigned a host path for you. If the host parameter contains a sourcePath file location, then the data volume persists at the specified location on the host container instance until you delete it manually. If the sourcePath value does not exist on the host container instance, the Docker daemon creates it. If the location does exist, the contents of the source path folder are exported.
      */
    var sourcePath: js.UndefOr[String] = js.undefined
  }
  
  trait JobDefinition extends js.Object {
    /**
      * An object with various properties specific to container-based jobs. 
      */
    var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the job definition. 
      */
    var jobDefinitionArn: String
    /**
      * The name of the job definition. 
      */
    var jobDefinitionName: String
    /**
      * An object with various properties specific to multi-node parallel jobs.
      */
    var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
    /**
      * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
      */
    var parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
      * The retry strategy to use for failed jobs that are submitted with this job definition.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    /**
      * The revision of the job definition.
      */
    var revision: Integer
    /**
      * The status of the job definition.
      */
    var status: js.UndefOr[String] = js.undefined
    /**
      * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished.
      */
    var timeout: js.UndefOr[JobTimeout] = js.undefined
    /**
      * The type of job definition.
      */
    var `type`: String
  }
  
  trait JobDependency extends js.Object {
    /**
      * The job ID of the AWS Batch job associated with this dependency.
      */
    var jobId: js.UndefOr[String] = js.undefined
    /**
      * The type of the job dependency.
      */
    var `type`: js.UndefOr[ArrayJobDependency] = js.undefined
  }
  
  trait JobDetail extends js.Object {
    /**
      * The array properties of the job, if it is an array job.
      */
    var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.undefined
    /**
      * A list of job attempts associated with this job.
      */
    var attempts: js.UndefOr[AttemptDetails] = js.undefined
    /**
      * An object representing the details of the container that is associated with the job.
      */
    var container: js.UndefOr[ContainerDetail] = js.undefined
    /**
      * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
      */
    var createdAt: js.UndefOr[Long] = js.undefined
    /**
      * A list of job names or IDs on which this job depends.
      */
    var dependsOn: js.UndefOr[JobDependencyList] = js.undefined
    /**
      * The job definition that is used by this job.
      */
    var jobDefinition: String
    /**
      * The ID for the job.
      */
    var jobId: String
    /**
      * The name of the job.
      */
    var jobName: String
    /**
      * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
      */
    var jobQueue: String
    /**
      * An object representing the details of a node that is associated with a multi-node parallel job.
      */
    var nodeDetails: js.UndefOr[NodeDetails] = js.undefined
    /**
      * An object representing the node properties of a multi-node parallel job.
      */
    var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
    /**
      * Additional parameters passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition. 
      */
    var parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
      * The retry strategy to use for this job if an attempt fails.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    /**
      * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
      */
    var startedAt: Long
    /**
      * The current status for the job.   If your jobs do not progress to STARTING, see Jobs Stuck in RUNNABLE Status in the troubleshooting section of the AWS Batch User Guide. 
      */
    var status: JobStatus
    /**
      * A short, human-readable string to provide additional details about the current status of the job. 
      */
    var statusReason: js.UndefOr[String] = js.undefined
    /**
      * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
      */
    var stoppedAt: js.UndefOr[Long] = js.undefined
    /**
      * The timeout configuration for the job. 
      */
    var timeout: js.UndefOr[JobTimeout] = js.undefined
  }
  
  trait JobQueueDetail extends js.Object {
    /**
      * The compute environments that are attached to the job queue and the order in which job placement is preferred. Compute environments are selected for job placement in ascending order.
      */
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    /**
      * The Amazon Resource Name (ARN) of the job queue.
      */
    var jobQueueArn: String
    /**
      * The name of the job queue.
      */
    var jobQueueName: String
    /**
      * The priority of the job queue. 
      */
    var priority: Integer
    /**
      * Describes the ability of the queue to accept new jobs.
      */
    var state: JQState
    /**
      * The status of the job queue (for example, CREATING or VALID).
      */
    var status: js.UndefOr[JQStatus] = js.undefined
    /**
      * A short, human-readable string to provide additional details about the current status of the job queue.
      */
    var statusReason: js.UndefOr[String] = js.undefined
  }
  
  trait JobSummary extends js.Object {
    /**
      * The array properties of the job, if it is an array job.
      */
    var arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined
    /**
      * An object representing the details of the container that is associated with the job.
      */
    var container: js.UndefOr[ContainerSummary] = js.undefined
    /**
      * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
      */
    var createdAt: js.UndefOr[Long] = js.undefined
    /**
      * The ID of the job.
      */
    var jobId: String
    /**
      * The name of the job.
      */
    var jobName: String
    /**
      * The node properties for a single node in a job summary list.
      */
    var nodeProperties: js.UndefOr[NodePropertiesSummary] = js.undefined
    /**
      * The Unix timestamp for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
      */
    var startedAt: js.UndefOr[Long] = js.undefined
    /**
      * The current status for the job.
      */
    var status: js.UndefOr[JobStatus] = js.undefined
    /**
      * A short, human-readable string to provide additional details about the current status of the job.
      */
    var statusReason: js.UndefOr[String] = js.undefined
    /**
      * The Unix timestamp for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
      */
    var stoppedAt: js.UndefOr[Long] = js.undefined
  }
  
  trait JobTimeout extends js.Object {
    /**
      * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
      */
    var attemptDurationSeconds: js.UndefOr[Integer] = js.undefined
  }
  
  trait KeyValuePair extends js.Object {
    /**
      * The name of the key-value pair. For environment variables, this is the name of the environment variable.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The value of the key-value pair. For environment variables, this is the value of the environment variable.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  
  trait LaunchTemplateSpecification extends js.Object {
    /**
      * The ID of the launch template.
      */
    var launchTemplateId: js.UndefOr[String] = js.undefined
    /**
      * The name of the launch template.
      */
    var launchTemplateName: js.UndefOr[String] = js.undefined
    /**
      * The version number of the launch template. Default: The default version of the launch template.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  
  trait ListJobsRequest extends js.Object {
    /**
      * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the specified array.
      */
    var arrayJobId: js.UndefOr[String] = js.undefined
    /**
      * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
      */
    var jobQueue: js.UndefOr[String] = js.undefined
    /**
      * The job status with which to filter jobs in the specified queue. If you do not specify a status, only RUNNING jobs are returned.
      */
    var jobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
      * The maximum number of results returned by ListJobs in paginated output. When this parameter is used, ListJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListJobs request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListJobs returns up to 100 results and a nextToken value if applicable.
      */
    var maxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all nodes that are associated with the specified job.
      */
    var multiNodeJobId: js.UndefOr[String] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListJobsResponse extends js.Object {
    /**
      * A list of job summaries that match the request.
      */
    var jobSummaryList: JobSummaryList
    /**
      * The nextToken value to include in a future ListJobs request. When the results of a ListJobs request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait MountPoint extends js.Object {
    /**
      * The path on the container at which to mount the host volume.
      */
    var containerPath: js.UndefOr[String] = js.undefined
    /**
      * If this value is true, the container has read-only access to the volume; otherwise, the container can write to the volume. The default value is false.
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the volume to mount.
      */
    var sourceVolume: js.UndefOr[String] = js.undefined
  }
  
  trait NetworkInterface extends js.Object {
    /**
      * The attachment ID for the network interface.
      */
    var attachmentId: js.UndefOr[String] = js.undefined
    /**
      * The private IPv6 address for the network interface.
      */
    var ipv6Address: js.UndefOr[String] = js.undefined
    /**
      * The private IPv4 address for the network interface.
      */
    var privateIpv4Address: js.UndefOr[String] = js.undefined
  }
  
  trait NodeDetails extends js.Object {
    /**
      * Specifies whether the current node is the main node for a multi-node parallel job.
      */
    var isMainNode: js.UndefOr[Boolean] = js.undefined
    /**
      * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
      */
    var nodeIndex: js.UndefOr[Integer] = js.undefined
  }
  
  trait NodeOverrides extends js.Object {
    /**
      * The node property overrides for the job.
      */
    var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides] = js.undefined
  }
  
  trait NodeProperties extends js.Object {
    /**
      * Specifies the node index for the main node of a multi-node parallel job.
      */
    var mainNode: Integer
    /**
      * A list of node ranges and their properties associated with a multi-node parallel job.
      */
    var nodeRangeProperties: NodeRangeProperties
    /**
      * The number of nodes associated with a multi-node parallel job.
      */
    var numNodes: Integer
  }
  
  trait NodePropertiesSummary extends js.Object {
    /**
      * Specifies whether the current node is the main node for a multi-node parallel job.
      */
    var isMainNode: js.UndefOr[Boolean] = js.undefined
    /**
      * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
      */
    var nodeIndex: js.UndefOr[Integer] = js.undefined
    /**
      * The number of nodes associated with a multi-node parallel job.
      */
    var numNodes: js.UndefOr[Integer] = js.undefined
  }
  
  trait NodePropertyOverride extends js.Object {
    /**
      * The overrides that should be sent to a node range.
      */
    var containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
    /**
      * The range of nodes, using node index values, with which to override. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range.
      */
    var targetNodes: String
  }
  
  trait NodeRangeProperty extends js.Object {
    /**
      * The container details for the node range.
      */
    var container: js.UndefOr[ContainerProperties] = js.undefined
    /**
      * The range of nodes, using node index values. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the 0:10 properties. 
      */
    var targetNodes: String
  }
  
  trait ParametersMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait RegisterJobDefinitionRequest extends js.Object {
    /**
      * An object with various properties specific to single-node container-based jobs. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
      */
    var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
    /**
      * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
      */
    var jobDefinitionName: String
    /**
      * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job, it becomes a multi-node parallel job. For more information, see Multi-node Parallel Jobs in the AWS Batch User Guide. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
      */
    var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
    /**
      * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
      */
    var parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
      * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is specified during a SubmitJob operation overrides the retry strategy defined here. If a job is terminated due to a timeout, it is not retried. 
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    /**
      * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified during a SubmitJob operation overrides the timeout configuration defined here. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
      */
    var timeout: js.UndefOr[JobTimeout] = js.undefined
    /**
      * The type of job definition.
      */
    var `type`: JobDefinitionType
  }
  
  trait RegisterJobDefinitionResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the job definition. 
      */
    var jobDefinitionArn: String
    /**
      * The name of the job definition.
      */
    var jobDefinitionName: String
    /**
      * The revision of the job definition.
      */
    var revision: Integer
  }
  
  trait RetryStrategy extends js.Object {
    /**
      * The number of times to move a job to the RUNNABLE status. You may specify between 1 and 10 attempts. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value.
      */
    var attempts: js.UndefOr[Integer] = js.undefined
  }
  
  trait SubmitJobRequest extends js.Object {
    /**
      * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. For more information, see Array Jobs in the AWS Batch User Guide.
      */
    var arrayProperties: js.UndefOr[ArrayProperties] = js.undefined
    /**
      * A list of container overrides in JSON format that specify the name of a container in the specified job definition and the overrides it should receive. You can override the default command for a container (that is specified in the job definition or the Docker image) with a command override. You can also override existing environment variables (that are specified in the job definition or Docker image) on a container or add new environment variables to it with an environment override.
      */
    var containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
    /**
      * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a SEQUENTIAL type dependency without specifying a job ID for array jobs so that each child array job completes sequentially, starting at index 0. You can also specify an N_TO_N type dependency with a job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of each dependency to complete before it can begin.
      */
    var dependsOn: js.UndefOr[JobDependencyList] = js.undefined
    /**
      * The job definition used by this job. This value can be either a name:revision or the Amazon Resource Name (ARN) for the job definition.
      */
    var jobDefinition: String
    /**
      * The name of the job. The first character must be alphanumeric, and up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. 
      */
    var jobName: String
    /**
      * The job queue into which the job is submitted. You can specify either the name or the Amazon Resource Name (ARN) of the queue. 
      */
    var jobQueue: String
    /**
      * A list of node overrides in JSON format that specify the node range to target and the container overrides for that node range.
      */
    var nodeOverrides: js.UndefOr[NodeOverrides] = js.undefined
    /**
      * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job definition. Parameters are specified as a key and value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
      */
    var parameters: js.UndefOr[ParametersMap] = js.undefined
    /**
      * The retry strategy to use for failed jobs from this SubmitJob operation. When a retry strategy is specified here, it overrides the retry strategy defined in the job definition.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    /**
      * The timeout configuration for this SubmitJob operation. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum value for the timeout is 60 seconds. This configuration overrides any timeout configuration specified in the job definition. For array jobs, child jobs have the same timeout configuration as the parent job. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
      */
    var timeout: js.UndefOr[JobTimeout] = js.undefined
  }
  
  trait SubmitJobResponse extends js.Object {
    /**
      * The unique identifier for the job.
      */
    var jobId: String
    /**
      * The name of the job. 
      */
    var jobName: String
  }
  
  trait TagsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait TerminateJobRequest extends js.Object {
    /**
      * The AWS Batch job ID of the job to terminate.
      */
    var jobId: String
    /**
      * A message to attach to the job that explains the reason for canceling it. This message is returned by future DescribeJobs operations on the job. This message is also recorded in the AWS Batch activity logs. 
      */
    var reason: String
  }
  
  trait TerminateJobResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING or RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these jobs must be terminated with the TerminateJob operation.
      */
    def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING or RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these jobs must be terminated with the TerminateJob operation.
      */
    def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJob(
      params: CancelJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute environments. In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is below a specified percentage of the On-Demand price.  Multi-node parallel jobs are not supported on Spot Instances.  In an unmanaged compute environment, you can manage your own compute resources. This provides more compute resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon ECS container instance AMI specification. For more information, see Container Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.  AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest operating system (including updates and security patches) and any additional application software or utilities that you install on the compute resources. To use a new AMI for your AWS Batch jobs:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the old compute environment from your job queue.   Delete the old compute environment.   
      */
    def createComputeEnvironment(): awsDashSdkLib.libRequestMod.Request[CreateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createComputeEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateComputeEnvironmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute environments. In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is below a specified percentage of the On-Demand price.  Multi-node parallel jobs are not supported on Spot Instances.  In an unmanaged compute environment, you can manage your own compute resources. This provides more compute resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon ECS container instance AMI specification. For more information, see Container Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.  AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest operating system (including updates and security patches) and any additional application software or utilities that you install on the compute resources. To use a new AMI for your AWS Batch jobs:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the old compute environment from your job queue.   Delete the old compute environment.   
      */
    def createComputeEnvironment(params: CreateComputeEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[CreateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createComputeEnvironment(
      params: CreateComputeEnvironmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateComputeEnvironmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
      */
    def createJobQueue(): awsDashSdkLib.libRequestMod.Request[CreateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createJobQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
      */
    def createJobQueue(params: CreateJobQueueRequest): awsDashSdkLib.libRequestMod.Request[CreateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createJobQueue(
      params: CreateJobQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an AWS Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation.
      */
    def deleteComputeEnvironment(): awsDashSdkLib.libRequestMod.Request[DeleteComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteComputeEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteComputeEnvironmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an AWS Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation.
      */
    def deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[DeleteComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteComputeEnvironment(
      params: DeleteComputeEnvironmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteComputeEnvironmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are terminated when you delete a job queue. It is not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request. 
      */
    def deleteJobQueue(): awsDashSdkLib.libRequestMod.Request[DeleteJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteJobQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteJobQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are terminated when you delete a job queue. It is not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request. 
      */
    def deleteJobQueue(params: DeleteJobQueueRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteJobQueue(
      params: DeleteJobQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteJobQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an AWS Batch job definition.
      */
    def deregisterJobDefinition(): awsDashSdkLib.libRequestMod.Request[DeregisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterJobDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterJobDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an AWS Batch job definition.
      */
    def deregisterJobDefinition(params: DeregisterJobDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeregisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterJobDefinition(
      params: DeregisterJobDefinitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterJobDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your compute environments. If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances into.
      */
    def describeComputeEnvironments(): awsDashSdkLib.libRequestMod.Request[DescribeComputeEnvironmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeComputeEnvironments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeComputeEnvironmentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeComputeEnvironmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your compute environments. If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances into.
      */
    def describeComputeEnvironments(params: DescribeComputeEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeComputeEnvironmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeComputeEnvironments(
      params: DescribeComputeEnvironmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeComputeEnvironmentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeComputeEnvironmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a list of job definitions. You can specify a status (such as ACTIVE) to only return job definitions that match that status.
      */
    def describeJobDefinitions(): awsDashSdkLib.libRequestMod.Request[DescribeJobDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobDefinitions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobDefinitionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a list of job definitions. You can specify a status (such as ACTIVE) to only return job definitions that match that status.
      */
    def describeJobDefinitions(params: DescribeJobDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobDefinitions(
      params: DescribeJobDefinitionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobDefinitionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your job queues.
      */
    def describeJobQueues(): awsDashSdkLib.libRequestMod.Request[DescribeJobQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobQueues(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobQueuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your job queues.
      */
    def describeJobQueues(params: DescribeJobQueuesRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobQueues(
      params: DescribeJobQueuesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobQueuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a list of AWS Batch jobs.
      */
    def describeJobs(): awsDashSdkLib.libRequestMod.Request[DescribeJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a list of AWS Batch jobs.
      */
    def describeJobs(params: DescribeJobsRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobs(
      params: DescribeJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of AWS Batch jobs. You must specify only one of the following:   a job queue ID to return a list of jobs in that job queue   a multi-node parallel job ID to return a list of that job's nodes   an array job ID to return a list of that job's children   You can filter the results by job status with the jobStatus parameter. If you do not specify a status, only RUNNING jobs are returned.
      */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of AWS Batch jobs. You must specify only one of the following:   a job queue ID to return a list of jobs in that job queue   a multi-node parallel job ID to return a list of that job's nodes   an array job ID to return a list of that job's children   You can filter the results by job status with the jobStatus parameter. If you do not specify a status, only RUNNING jobs are returned.
      */
    def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      params: ListJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an AWS Batch job definition. 
      */
    def registerJobDefinition(): awsDashSdkLib.libRequestMod.Request[RegisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerJobDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterJobDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an AWS Batch job definition. 
      */
    def registerJobDefinition(params: RegisterJobDefinitionRequest): awsDashSdkLib.libRequestMod.Request[RegisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerJobDefinition(
      params: RegisterJobDefinitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterJobDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterJobDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters defined in the job definition. 
      */
    def submitJob(): awsDashSdkLib.libRequestMod.Request[SubmitJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def submitJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SubmitJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SubmitJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters defined in the job definition. 
      */
    def submitJob(params: SubmitJobRequest): awsDashSdkLib.libRequestMod.Request[SubmitJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def submitJob(
      params: SubmitJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SubmitJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SubmitJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are terminated, which causes them to transition to FAILED. Jobs that have not progressed to the STARTING state are cancelled.
      */
    def terminateJob(): awsDashSdkLib.libRequestMod.Request[TerminateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TerminateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TerminateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are terminated, which causes them to transition to FAILED. Jobs that have not progressed to the STARTING state are cancelled.
      */
    def terminateJob(params: TerminateJobRequest): awsDashSdkLib.libRequestMod.Request[TerminateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateJob(
      params: TerminateJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TerminateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TerminateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an AWS Batch compute environment.
      */
    def updateComputeEnvironment(): awsDashSdkLib.libRequestMod.Request[UpdateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateComputeEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateComputeEnvironmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an AWS Batch compute environment.
      */
    def updateComputeEnvironment(params: UpdateComputeEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[UpdateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateComputeEnvironment(
      params: UpdateComputeEnvironmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateComputeEnvironmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateComputeEnvironmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a job queue.
      */
    def updateJobQueue(): awsDashSdkLib.libRequestMod.Request[UpdateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJobQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a job queue.
      */
    def updateJobQueue(params: UpdateJobQueueRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJobQueue(
      params: UpdateJobQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait Ulimit extends js.Object {
    /**
      * The hard limit for the ulimit type.
      */
    var hardLimit: Integer
    /**
      * The type of the ulimit.
      */
    var name: String
    /**
      * The soft limit for the ulimit type.
      */
    var softLimit: Integer
  }
  
  trait UpdateComputeEnvironmentRequest extends js.Object {
    /**
      * The name or full Amazon Resource Name (ARN) of the compute environment to update.
      */
    var computeEnvironment: String
    /**
      * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
      */
    var computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined
    /**
      * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf. If your specified role has a path other than /, then you must either specify the full role ARN (this is recommended) or prefix the role name with the path.  Depending on how you created your AWS Batch service role, its ARN may contain the service-role path prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
      */
    var serviceRole: js.UndefOr[String] = js.undefined
    /**
      * The state of the compute environment. Compute environments in the ENABLED state can accept jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
      */
    var state: js.UndefOr[CEState] = js.undefined
  }
  
  trait UpdateComputeEnvironmentResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the compute environment. 
      */
    var computeEnvironmentArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the compute environment.
      */
    var computeEnvironmentName: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateJobQueueRequest extends js.Object {
    /**
      * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one of the parameters used by the job scheduler to determine which compute environment should execute a given job. 
      */
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined
    /**
      * The name or the Amazon Resource Name (ARN) of the job queue.
      */
    var jobQueue: String
    /**
      * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
      */
    var priority: js.UndefOr[Integer] = js.undefined
    /**
      * Describes the queue's ability to accept new jobs.
      */
    var state: js.UndefOr[JQState] = js.undefined
  }
  
  trait UpdateJobQueueResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the job queue.
      */
    var jobQueueArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the job queue.
      */
    var jobQueueName: js.UndefOr[String] = js.undefined
  }
  
  trait Volume extends js.Object {
    /**
      * The contents of the host parameter determine whether your data volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data is not guaranteed to persist after the containers associated with it stop running.
      */
    var host: js.UndefOr[Host] = js.undefined
    /**
      * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. This name is referenced in the sourceVolume parameter of container definition mountPoints.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  
  trait _ArrayJobDependency extends js.Object
  
  trait _CEState extends js.Object
  
  trait _CEStatus extends js.Object
  
  trait _CEType extends js.Object
  
  trait _CRType extends js.Object
  
  trait _JQState extends js.Object
  
  trait _JQStatus extends js.Object
  
  trait _JobDefinitionType extends js.Object
  
  trait _JobStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ArrayJobDependency = _ArrayJobDependency | java.lang.String
  type AttemptDetails = js.Array[AttemptDetail]
  type Boolean = scala.Boolean
  type CEState = _CEState | java.lang.String
  type CEStatus = _CEStatus | java.lang.String
  type CEType = _CEType | java.lang.String
  type CRType = _CRType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders = js.Array[ComputeEnvironmentOrder]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Integer = scala.Double
  type JQState = _JQState | java.lang.String
  type JQStatus = _JQStatus | java.lang.String
  type JobDefinitionList = js.Array[JobDefinition]
  type JobDefinitionType = _JobDefinitionType | java.lang.String
  type JobDependencyList = js.Array[JobDependency]
  type JobDetailList = js.Array[JobDetail]
  type JobQueueDetailList = js.Array[JobQueueDetail]
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaryList = js.Array[JobSummary]
  type Long = scala.Double
  type MountPoints = js.Array[MountPoint]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NodePropertyOverrides = js.Array[NodePropertyOverride]
  type NodeRangeProperties = js.Array[NodeRangeProperty]
  type String = java.lang.String
  type StringList = js.Array[String]
  type Ulimits = js.Array[Ulimit]
  type Volumes = js.Array[Volume]
  type apiVersion = _apiVersion | java.lang.String
}

