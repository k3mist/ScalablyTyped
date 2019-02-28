package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/fsx", "FSx")
@js.native
object FSxNs extends js.Object {
  trait Backup extends js.Object {
    /**
      * The ID of the backup.
      */
    var BackupId: BackupId
    /**
      * The time when a particular backup was created.
      */
    var CreationTime: CreationTime
    /**
      * Details explaining any failures that occur when creating a backup.
      */
    var FailureDetails: js.UndefOr[BackupFailureDetails] = js.undefined
    /**
      * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is deleted.
      */
    var FileSystem: FileSystem
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
      */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The lifecycle status of the backup.
      */
    var Lifecycle: BackupLifecycle
    var ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the backup resource.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * Tags associated with a particular file system.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The type of the backup.
      */
    var Type: BackupType
  }
  
  trait BackupFailureDetails extends js.Object {
    /**
      * A message describing the backup creation failure.
      */
    var Message: js.UndefOr[ErrorMessage] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateBackupRequest extends js.Object {
    /**
      * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The ID of the file system to back up.
      */
    var FileSystemId: FileSystemId
    /**
      * The tags to apply to the backup at backup creation. The key value of the Name tag appears in the console as the backup name.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateBackupResponse extends js.Object {
    /**
      * A description of the backup.
      */
    var Backup: js.UndefOr[Backup] = js.undefined
  }
  
  trait CreateFileSystemFromBackupRequest extends js.Object {
    var BackupId: BackupId
    /**
      * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups apply to all network interfaces. This value isn't returned in later describe requests.
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
      * A list of IDs for the subnets that the file system will be accessible from. Currently, you can specify only one subnet. The file server is also launched in that subnet's Availability Zone.
      */
    var SubnetIds: SubnetIds
    /**
      * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The configuration for this Microsoft Windows file system.
      */
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
  }
  
  trait CreateFileSystemFromBackupResponse extends js.Object {
    /**
      * A description of the file system.
      */
    var FileSystem: js.UndefOr[FileSystem] = js.undefined
  }
  
  trait CreateFileSystemLustreConfiguration extends js.Object {
    /**
      * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed data is to be exported from your Amazon FSx for Lustre file system. If an ExportPath value is not provided, Amazon FSx sets a default export path, s3://import-bucket/FSxLustre[creation-timestamp]. The timestamp is in UTC format, for example s3://import-bucket/FSxLustre20181105T222312Z. The Amazon S3 export bucket must be the same as the import bucket specified by ImportPath. If you only specify a bucket name, such as s3://import-bucket, you get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a custom prefix in the export path, such as s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file system to that export prefix in the Amazon S3 bucket.
      */
    var ExportPath: js.UndefOr[ArchivePath] = js.undefined
    /**
      * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3 bucket you select. An example is s3://import-bucket/optional-prefix. If you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
      */
    var ImportPath: js.UndefOr[ArchivePath] = js.undefined
    /**
      * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
      */
    var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
    /**
      * The preferred time to perform weekly maintenance, in the UTC time zone.
      */
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
  }
  
  trait CreateFileSystemRequest extends js.Object {
    /**
      * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The type of file system.
      */
    var FileSystemType: FileSystemType
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined
    /**
      * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces. This list isn't returned in later describe requests.
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
      * The storage capacity of the file system. For Windows file systems, the storage capacity has a minimum of 300 GiB, and a maximum of 65,536 GiB. For Lustre file systems, the storage capacity has a minimum of 3,600 GiB. Storage capacity is provisioned in increments of 3,600 GiB.
      */
    var StorageCapacity: StorageCapacity
    /**
      * A list of IDs for the subnets that the file system will be accessible from. File systems support only one subnet. The file server is also launched in that subnet's Availability Zone.
      */
    var SubnetIds: SubnetIds
    /**
      * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The configuration for this Microsoft Windows file system.
      */
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
  }
  
  trait CreateFileSystemResponse extends js.Object {
    /**
      * A description of the file system.
      */
    var FileSystem: js.UndefOr[FileSystem] = js.undefined
  }
  
  trait CreateFileSystemWindowsConfiguration extends js.Object {
    /**
      * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
      */
    var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
      */
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined
    /**
      * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
      */
    var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
    /**
      * The preferred time to take daily automatic backups, in the UTC time zone.
      */
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
    /**
      * The throughput of an Amazon FSx file system, measured in megabytes per second.
      */
    var ThroughputCapacity: MegabytesPerSecond
    /**
      * The preferred start time to perform weekly maintenance, in the UTC time zone.
      */
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
  }
  
  trait DataRepositoryConfiguration extends js.Object {
    /**
      * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file system files in S3.
      */
    var ExportPath: js.UndefOr[ArchivePath] = js.undefined
    /**
      * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your FSx for Lustre file system, for example s3://import-bucket/optional-prefix. If a prefix is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
      */
    var ImportPath: js.UndefOr[ArchivePath] = js.undefined
    /**
      * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
      */
    var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  }
  
  trait DeleteBackupRequest extends js.Object {
    /**
      * The ID of the backup you want to delete.
      */
    var BackupId: BackupId
    /**
      * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is automatically filled on your behalf when using the AWS CLI or SDK.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  }
  
  trait DeleteBackupResponse extends js.Object {
    /**
      * The ID of the backup deleted.
      */
    var BackupId: js.UndefOr[BackupId] = js.undefined
    /**
      * The lifecycle of the backup. Should be DELETED.
      */
    var Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined
  }
  
  trait DeleteFileSystemRequest extends js.Object {
    /**
      * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is automatically filled on your behalf when using the AWS CLI or SDK.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The ID of the file system you want to delete.
      */
    var FileSystemId: FileSystemId
    var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration] = js.undefined
  }
  
  trait DeleteFileSystemResponse extends js.Object {
    /**
      * The ID of the file system being deleted.
      */
    var FileSystemId: js.UndefOr[FileSystemId] = js.undefined
    /**
      * The file system lifecycle for the deletion request. Should be DELETING.
      */
    var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
    var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined
  }
  
  trait DeleteFileSystemWindowsConfiguration extends js.Object {
    /**
      * A set of tags for your final backup.
      */
    var FinalBackupTags: js.UndefOr[Tags] = js.undefined
    /**
      * By default, Amazon FSx for Windows takes a final backup on your behalf when the DeleteFileSystem operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final backup. If you want to skip this backup, use this flag to do so.
      */
    var SkipFinalBackup: js.UndefOr[Flag] = js.undefined
  }
  
  trait DeleteFileSystemWindowsResponse extends js.Object {
    /**
      * The ID of the final backup for this file system.
      */
    var FinalBackupId: js.UndefOr[BackupId] = js.undefined
    /**
      * The set of tags applied to the final backup.
      */
    var FinalBackupTags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DescribeBackupsRequest extends js.Object {
    /**
      * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not found, BackupNotFound will be thrown.
      */
    var BackupIds: js.UndefOr[BackupIds] = js.undefined
    /**
      * (Optional) Filters structure. Supported names are file-system-id and backup-type.
      */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
      * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * (Optional) Opaque pagination token returned from a previous DescribeBackups operation (String). If a token present, the action continues the list from where the returning call left off.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeBackupsResponse extends js.Object {
    /**
      * Any array of backups.
      */
    var Backups: js.UndefOr[Backups] = js.undefined
    /**
      * This is present if there are more backups than returned in the response (String). You can use the NextToken value in the later request to fetch the backups. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeFileSystemsRequest extends js.Object {
    /**
      * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
      */
    var FileSystemIds: js.UndefOr[FileSystemIds] = js.undefined
    /**
      * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * (Optional) Opaque pagination token returned from a previous DescribeFileSystems operation (String). If a token present, the action continues the list from where the returning call left off.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeFileSystemsResponse extends js.Object {
    /**
      * An array of file system descriptions.
      */
    var FileSystems: js.UndefOr[FileSystems] = js.undefined
    /**
      * Present if there are more file systems than returned in the response (String). You can use the NextToken value in the later request to fetch the descriptions. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait FileSystem extends js.Object {
    /**
      * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
      */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
      * The DNS name for the file system.
      */
    var DNSName: js.UndefOr[DNSName] = js.undefined
    var FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.undefined
    /**
      * The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
      */
    var FileSystemId: js.UndefOr[FileSystemId] = js.undefined
    /**
      * Type of file system. Currently the only supported type is WINDOWS.
      */
    var FileSystemType: js.UndefOr[FileSystemType] = js.undefined
    /**
      * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx for Windows File Server file system.
      */
    var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The lifecycle status of the file system.
      */
    var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
    var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined
    /**
      * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more information, see Elastic Network Interfaces in the Amazon EC2 User Guide.  For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an Amazon FSx for Lustre file system, you can have more than one.
      */
    var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds] = js.undefined
    /**
      * The AWS account that created the file system. If the file system was created by an IAM user, the AWS account to which the IAM user belongs is the owner.
      */
    var OwnerId: js.UndefOr[AWSAccountId] = js.undefined
    /**
      * The resource ARN of the file system.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The storage capacity of the file system in gigabytes.
      */
    var StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined
    /**
      * The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The file system is launched in the Availability Zone associated with this subnet.
      */
    var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    /**
      * The tags to associate with the file system. For more information, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The ID of the primary VPC for the file system.
      */
    var VpcId: js.UndefOr[VpcId] = js.undefined
    /**
      * The configuration for this Microsoft Windows file system.
      */
    var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined
  }
  
  trait FileSystemFailureDetails extends js.Object {
    /**
      * Message describing the failures that occurred during file system creation.
      */
    var Message: js.UndefOr[ErrorMessage] = js.undefined
  }
  
  trait Filter extends js.Object {
    /**
      * The name for this filter.
      */
    var Name: js.UndefOr[FilterName] = js.undefined
    /**
      * The values of the filter. These are all the values for any of the applied filters.
      */
    var Values: js.UndefOr[FilterValues] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * (Optional) Maximum number of tags to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * (Optional) Opaque pagination token returned from a previous ListTagsForResource operation (String). If a token present, the action continues the list from where the returning call left off.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ARN of the Amazon FSx resource that will have its tags listed.
      */
    var ResourceARN: ResourceARN
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * This is present if there are more tags than returned in the response (String). You can use the NextToken value in the later request to fetch the tags. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of tags on the resource.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait LustreFileSystemConfiguration extends js.Object {
    var DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration] = js.undefined
    /**
      * The UTC time that you want to begin your weekly maintenance window.
      */
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * A value that specifies the TagKey, the name of the tag. Tag keys must be unique for the resource to which they are attached.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * A value that specifies the TagValue, the value assigned to the corresponding tag key. Tag values can be null and don't have to be unique in a tag set. For example, you can have a key-value pair in a tag set of finances : April and also of payroll : April.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon FSx resource that you want to tag.
      */
    var ResourceARN: ResourceARN
    /**
      * A list of tags for the resource. If a tag with a given key already exists, the value is replaced by the one specified in this parameter.
      */
    var Tags: Tags
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a backup of an existing Amazon FSx for Windows File Server file system. Creating regular backups for your file system is a best practice that complements the replication that Amazon FSx for Windows File Server performs for your file system. It also enables you to restore from user modification of data. If a backup with the specified client request token exists, and the parameters match, this operation returns the description of the existing backup. If a backup specified client request token exists, and the parameters don't match, this operation returns IncompatibleParameterError. If a backup with the specified client request token doesn't exist, CreateBackup does the following:    Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the backup.   By using the idempotent operation, you can retry a CreateBackup operation without the risk of creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear whether a backup was created. If you use the same client request token and the initial call created a backup, the operation returns a successful result because all the parameters are the same. The CreateFileSystem operation returns while the backup's lifecycle state is still CREATING. You can check the file system creation status by calling the DescribeBackups operation, which returns the backup state along with other information.   
      */
    def createBackup(): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a backup of an existing Amazon FSx for Windows File Server file system. Creating regular backups for your file system is a best practice that complements the replication that Amazon FSx for Windows File Server performs for your file system. It also enables you to restore from user modification of data. If a backup with the specified client request token exists, and the parameters match, this operation returns the description of the existing backup. If a backup specified client request token exists, and the parameters don't match, this operation returns IncompatibleParameterError. If a backup with the specified client request token doesn't exist, CreateBackup does the following:    Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the backup.   By using the idempotent operation, you can retry a CreateBackup operation without the risk of creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear whether a backup was created. If you use the same client request token and the initial call created a backup, the operation returns a successful result because all the parameters are the same. The CreateFileSystem operation returns while the backup's lifecycle state is still CREATING. You can check the file system creation status by calling the DescribeBackups operation, which returns the backup state along with other information.   
      */
    def createBackup(params: CreateBackupRequest): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackup(
      params: CreateBackupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new, empty Amazon FSx file system. If a file system with the specified client request token exists and the parameters match, CreateFileSystem returns the description of the existing file system. If a file system specified client request token exists and the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, CreateFileSystem does the following:    Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system.   This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation. This means that calling the operation multiple times with the same client request token has no effect. By using the idempotent operation, you can retry a CreateFileSystem operation without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives success as long as the parameters are the same.  The CreateFileSystem call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the DescribeFileSystems operation, which returns the file system state along with other information. 
      */
    def createFileSystem(): awsDashSdkLib.libRequestMod.Request[CreateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFileSystem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFileSystemResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new, empty Amazon FSx file system. If a file system with the specified client request token exists and the parameters match, CreateFileSystem returns the description of the existing file system. If a file system specified client request token exists and the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, CreateFileSystem does the following:    Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system.   This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation. This means that calling the operation multiple times with the same client request token has no effect. By using the idempotent operation, you can retry a CreateFileSystem operation without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives success as long as the parameters are the same.  The CreateFileSystem call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the DescribeFileSystems operation, which returns the file system state along with other information. 
      */
    def createFileSystem(params: CreateFileSystemRequest): awsDashSdkLib.libRequestMod.Request[CreateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFileSystem(
      params: CreateFileSystemRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFileSystemResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon FSx file system from an existing Amazon FSx for Windows File Server backup. If a file system with the specified client request token exists and the parameters match, this call returns the description of the existing file system. If a client request token specified by the file system exists and the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, this operation does the following:   Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system.   Parameters like Active Directory, default share name, automatic backup, and backup settings default to the parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings. By using the idempotent operation, you can retry a CreateFileSystemFromBackup call without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives success as long as the parameters are the same.  The CreateFileSystemFromBackup call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the DescribeFileSystems operation, which returns the file system state along with other information. 
      */
    def createFileSystemFromBackup(): awsDashSdkLib.libRequestMod.Request[CreateFileSystemFromBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFileSystemFromBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFileSystemFromBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFileSystemFromBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon FSx file system from an existing Amazon FSx for Windows File Server backup. If a file system with the specified client request token exists and the parameters match, this call returns the description of the existing file system. If a client request token specified by the file system exists and the parameters don't match, this call returns IncompatibleParameterError. If a file system with the specified client request token doesn't exist, this operation does the following:   Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of CREATING.   Returns the description of the file system.   Parameters like Active Directory, default share name, automatic backup, and backup settings default to the parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings. By using the idempotent operation, you can retry a CreateFileSystemFromBackup call without the risk of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If you use the same client request token and the initial call created a file system, the client receives success as long as the parameters are the same.  The CreateFileSystemFromBackup call returns while the file system's lifecycle state is still CREATING. You can check the file-system creation status by calling the DescribeFileSystems operation, which returns the file system state along with other information. 
      */
    def createFileSystemFromBackup(params: CreateFileSystemFromBackupRequest): awsDashSdkLib.libRequestMod.Request[CreateFileSystemFromBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFileSystemFromBackup(
      params: CreateFileSystemFromBackupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFileSystemFromBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFileSystemFromBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon FSx for Windows File Server backup, deleting its contents. After deletion, the backup no longer exists, and its data is gone. The DeleteBackup call returns instantly. The backup will not show up in later DescribeBackups calls.  The data in a deleted backup is also deleted and can't be recovered by any means. 
      */
    def deleteBackup(): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon FSx for Windows File Server backup, deleting its contents. After deletion, the backup no longer exists, and its data is gone. The DeleteBackup call returns instantly. The backup will not show up in later DescribeBackups calls.  The data in a deleted backup is also deleted and can't be recovered by any means. 
      */
    def deleteBackup(params: DeleteBackupRequest): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackup(
      params: DeleteBackupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is gone. Any existing automatic backups will also be deleted. By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted. The DeleteFileSystem action returns while the file system has the DELETING status. You can check the file system deletion status by calling the DescribeFileSystems action, which returns a list of file systems in your account. If you pass the file system ID for a deleted file system, the DescribeFileSystems returns a FileSystemNotFound error.  The data in a deleted file system is also deleted and can't be recovered by any means. 
      */
    def deleteFileSystem(): awsDashSdkLib.libRequestMod.Request[DeleteFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFileSystem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFileSystemResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is gone. Any existing automatic backups will also be deleted. By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted. The DeleteFileSystem action returns while the file system has the DELETING status. You can check the file system deletion status by calling the DescribeFileSystems action, which returns a list of file systems in your account. If you pass the file system ID for a deleted file system, the DescribeFileSystems returns a FileSystemNotFound error.  The data in a deleted file system is also deleted and can't be recovered by any means. 
      */
    def deleteFileSystem(params: DeleteFileSystemRequest): awsDashSdkLib.libRequestMod.Request[DeleteFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFileSystem(
      params: DeleteFileSystemRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFileSystemResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of specific Amazon FSx for Windows File Server backups, if a BackupIds value is provided for that backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the endpoint that you're calling. When retrieving all backups, you can optionally specify the MaxResults parameter to limit the number of backups in a response. If more backups remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your backups. DescribeBackups is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of backups returned in the response of one DescribeBackups call and the order of backups returned across the responses of a multi-call iteration is unspecified.  
      */
    def describeBackups(): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of specific Amazon FSx for Windows File Server backups, if a BackupIds value is provided for that backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the endpoint that you're calling. When retrieving all backups, you can optionally specify the MaxResults parameter to limit the number of backups in a response. If more backups remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your backups. DescribeBackups is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of backups returned in the response of one DescribeBackups call and the order of backups returned across the responses of a multi-call iteration is unspecified.  
      */
    def describeBackups(params: DescribeBackupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackups(
      params: DescribeBackupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of specific Amazon FSx file systems, if a FileSystemIds value is provided for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS Region of the endpoint that you're calling. When retrieving all file system descriptions, you can optionally specify the MaxResults parameter to limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your file system descriptions. DescribeFileSystems is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of file systems returned in the response of one DescribeFileSystems call and the order of file systems returned across the responses of a multicall iteration is unspecified.  
      */
    def describeFileSystems(): awsDashSdkLib.libRequestMod.Request[DescribeFileSystemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFileSystems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFileSystemsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFileSystemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of specific Amazon FSx file systems, if a FileSystemIds value is provided for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS Region of the endpoint that you're calling. When retrieving all file system descriptions, you can optionally specify the MaxResults parameter to limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your file system descriptions. DescribeFileSystems is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of file systems returned in the response of one DescribeFileSystems call and the order of file systems returned across the responses of a multicall iteration is unspecified.  
      */
    def describeFileSystems(params: DescribeFileSystemsRequest): awsDashSdkLib.libRequestMod.Request[DescribeFileSystemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFileSystems(
      params: DescribeFileSystemsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFileSystemsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFileSystemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server. When retrieving all tags, you can optionally specify the MaxResults parameter to limit the number of tags in a response. If more tags remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your tags. ListTagsForResource is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of tags returned in the response of one ListTagsForResource call and the order of tags returned across the responses of a multi-call iteration is unspecified.  
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server. When retrieving all tags, you can optionally specify the MaxResults parameter to limit the number of tags in a response. If more tags remain, Amazon FSx returns a NextToken value in the response. In this case, send a later request with the NextToken request parameter set to the value of NextToken from the last response. This action is used in an iterative process to retrieve a list of your tags. ListTagsForResource is called first without a NextTokenvalue. Then the action continues to be called with the NextToken parameter set to the value of the last NextToken value until a response has no NextToken. When using this action, keep the following in mind:   The implementation might return fewer than MaxResults file system descriptions while still including a NextToken value.   The order of tags returned in the response of one ListTagsForResource call and the order of tags returned across the responses of a multi-call iteration is unspecified.  
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tags an Amazon FSx resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tags an Amazon FSx resource.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This action removes a tag from an Amazon FSx resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This action removes a tag from an Amazon FSx resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a file system configuration.
      */
    def updateFileSystem(): awsDashSdkLib.libRequestMod.Request[UpdateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFileSystem(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFileSystemResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a file system configuration.
      */
    def updateFileSystem(params: UpdateFileSystemRequest): awsDashSdkLib.libRequestMod.Request[UpdateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFileSystem(
      params: UpdateFileSystemRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFileSystemResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFileSystemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The ARN of the Amazon FSx resource to untag.
      */
    var ResourceARN: ResourceARN
    /**
      * A list of keys of tags on the resource to untag. In case the tag key doesn't exist, the call will still succeed to be idempotent.
      */
    var TagKeys: TagKeys
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateFileSystemLustreConfiguration extends js.Object {
    /**
      * The preferred time to perform weekly maintenance, in the UTC time zone.
      */
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
  }
  
  trait UpdateFileSystemRequest extends js.Object {
    /**
      * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    var FileSystemId: FileSystemId
    var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined
    /**
      * The configuration for this Microsoft Windows file system. The only supported options are for backup and maintenance.
      */
    var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined
  }
  
  trait UpdateFileSystemResponse extends js.Object {
    /**
      * A description of the file system.
      */
    var FileSystem: js.UndefOr[FileSystem] = js.undefined
  }
  
  trait UpdateFileSystemWindowsConfiguration extends js.Object {
    /**
      * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
      */
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined
    /**
      * The preferred time to take daily automatic backups, in the UTC time zone.
      */
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
    /**
      * The preferred time to perform weekly maintenance, in the UTC time zone.
      */
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
  }
  
  trait WindowsFileSystemConfiguration extends js.Object {
    /**
      * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
      */
    var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
      */
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined
    /**
      * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
      */
    var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
    /**
      * The preferred time to take daily automatic backups, in the UTC time zone.
      */
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
    /**
      * The list of maintenance operations in progress for this file system.
      */
    var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.undefined
    /**
      * The throughput of an Amazon FSx file system, measured in megabytes per second.
      */
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
    /**
      * The preferred time to perform weekly maintenance, in the UTC time zone.
      */
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
  }
  
  trait _BackupLifecycle extends js.Object
  
  trait _BackupType extends js.Object
  
  trait _FileSystemLifecycle extends js.Object
  
  trait _FileSystemMaintenanceOperation extends js.Object
  
  trait _FileSystemType extends js.Object
  
  trait _FilterName extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AWSAccountId = java.lang.String
  type ArchivePath = java.lang.String
  type AutomaticBackupRetentionDays = scala.Double
  type BackupId = java.lang.String
  type BackupIds = js.Array[BackupId]
  type BackupLifecycle = _BackupLifecycle | java.lang.String
  type BackupType = _BackupType | java.lang.String
  type Backups = js.Array[Backup]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreationTime = stdLib.Date
  type DNSName = java.lang.String
  type DailyTime = java.lang.String
  type DirectoryId = java.lang.String
  type ErrorMessage = java.lang.String
  type FileSystemId = java.lang.String
  type FileSystemIds = js.Array[FileSystemId]
  type FileSystemLifecycle = _FileSystemLifecycle | java.lang.String
  type FileSystemMaintenanceOperation = _FileSystemMaintenanceOperation | java.lang.String
  type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]
  type FileSystemType = _FileSystemType | java.lang.String
  type FileSystems = js.Array[FileSystem]
  type FilterName = _FilterName | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Flag = scala.Boolean
  type KmsKeyId = java.lang.String
  type MaxResults = scala.Double
  type Megabytes = scala.Double
  type MegabytesPerSecond = scala.Double
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = java.lang.String
  type ProgressPercent = scala.Double
  type ResourceARN = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type StorageCapacity = scala.Double
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type VpcId = java.lang.String
  type WeeklyTime = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

