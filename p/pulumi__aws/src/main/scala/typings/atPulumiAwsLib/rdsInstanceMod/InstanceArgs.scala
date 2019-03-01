package typings
package atPulumiAwsLib.rdsInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceArgs extends js.Object {
  /**
    * (Required unless a `snapshot_identifier` or
    * `replicate_source_db` is provided) The allocated storage in gibibytes.
    */
  val allocatedStorage: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Indicates that major version
    * upgrades are allowed. Changing this parameter does not result in an outage and
    * the change is asynchronously applied as soon as possible.
    */
  val allowMajorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more
    * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    * for more information.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Indicates that minor engine upgrades
    * will be applied automatically to the DB instance during the maintenance window.
    * Defaults to true.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The AZ for the RDS instance.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The days to retain backups for. Must be
    * between `0` and `35`. When creating a Read Replica the value must be greater than `0`. [See Read Replica][1].
    */
  val backupRetentionPeriod: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range (in UTC) during which
    * automated backups are created if they are enabled. Example: "09:46-10:16". Must
    * not overlap with `maintenance_window`.
    */
  val backupWindow: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The character set name to use for DB
    * encoding in Oracle instances. This can't be changed. See [Oracle Character Sets
    * Supported in Amazon
    * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
    * for more information.
    */
  val characterSetName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Copy all Instance `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Name of [DB subnet group](https://www.terraform.io/docs/providers/aws/r/db_subnet_group.html). DB instance will
    * be created in the VPC associated with the DB subnet group. If unspecified, will
    * be created in the `default` VPC, or in EC2 Classic, if available. When working
    * with read replicas, it needs to be specified only if the source database
    * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
    * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
    * for additional read replica contraints.
    */
  val dbSubnetGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ID of the Directory Service Active Directory domain to create the instance in.
    */
  val domain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  val domainIamRoleName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`): `alert`, `audit`, `error`, `general`, `listener`, `slowquery`, `trace`, `postgresql` (PostgreSQL), `upgrade` (PostgreSQL).
    */
  val enabledCloudwatchLogsExports: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * (Required unless a `snapshot_identifier` or `replicate_source_db`
    * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine must match the [DB cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html)'s engine'.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The engine version to use. If `auto_minor_version_upgrade`
    * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
    * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
    * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine version must match the [DB cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html)'s engine version'.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of your final DB snapshot
    * when this DB instance is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether or
    * mappings of AWS Identity and Access Management (IAM) accounts to database
    * accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the RDS instance,
    * if omitted, Terraform will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique
    * identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The instance type of the RDS instance.
    */
  val instanceClass: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The amount of provisioned IOPS. Setting this implies a
    * storage_type of "io1".
    */
  val iops: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN for the KMS encryption key. If creating an
    * encrypted replica, set this to the destination KMS ARN.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * (Optional, but required for some DB engines, i.e. Oracle
    * SE1) License model information for this DB instance.
    */
  val licenseModel: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
    * Maintenance Window
    * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
    * for more information.
    */
  val maintenanceWindow: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The interval, in seconds, between points
    * when Enhanced Monitoring metrics are collected for the DB instance. To disable
    * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
    * Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN for the IAM role that permits RDS
    * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
    * information on the [AWS
    * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies if the RDS instance is multi-AZ
    */
  val multiAz: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the DB option group to associate.
    */
  val optionGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the DB parameter group to
    * associate.
    */
  val parameterGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * (Required unless a `snapshot_identifier` or `replicate_source_db`
    * is provided) Password for the master DB user. Note that this may show up in
    * logs, and it will be stored in the state file.
    */
  val password: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The port on which the DB accepts connections.
    */
  val port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Bool to control if instance is publicly
    * accessible. Default is `false`.
    */
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies that this resource is a Replicate
    * database, and to use this value as the source database. This correlates to the
    * `identifier` of another Amazon RDS Database to replicate. Note that if you are
    * creating a cross-region replica of an encrypted database you will also need to
    * specify a `kms_key_id`. See [DB Instance Replication][1] and [Working with
    * PostgreSQL and MySQL Read Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html)
    * for more information on using Replication.
    */
  val replicateSourceDb: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
    */
  val s3Import: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameBucketPrefixIngestionRole]
  ] = js.undefined
  /**
    * List of DB Security Groups to
    * associate. Only used for [DB Instances on the _EC2-Classic_
    * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
    */
  val securityGroupNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Determines whether a final DB snapshot is
    * created before the DB instance is deleted. If true is specified, no DBSnapshot
    * is created. If false is specified, a DB snapshot is created before the DB
    * instance is deleted, using the value from `final_snapshot_identifier`. Default
    * is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether or not to create this
    * database from a snapshot. This correlates to the snapshot ID you'd find in the
    * RDS console, e.g: rds:production-2015-06-26-06-05.
    */
  val snapshotIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the DB instance is
    * encrypted. Note that if you are creating a cross-region read replica this field
    * is ignored and you should instead declare `kms_key_id` with a valid ARN. The
    * default is `false` if not specified.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * One of "standard" (magnetic), "gp2" (general
    * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
    * specified, "standard" if not. Note that this behaviour is different from the AWS
    * web console, where the default is "gp2".
    */
  val storageType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Time zone of the DB instance. `timezone` is currently
    * only supported by Microsoft SQL Server. The `timezone` can only be set on
    * creation. See [MSSQL User
    * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
    * for more information.
    */
  val timezone: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * (Required unless a `snapshot_identifier` or `replicate_source_db`
    * is provided) Username for the master DB user.
    */
  val username: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of VPC security groups to
    * associate.
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object InstanceArgs {
  @scala.inline
  def apply(
    instanceClass: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    allocatedStorage: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    allowMajorVersionUpgrade: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    applyImmediately: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    autoMinorVersionUpgrade: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    availabilityZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    backupRetentionPeriod: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    backupWindow: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    characterSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    copyTagsToSnapshot: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    dbSubnetGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    deletionProtection: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    domain: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    domainIamRoleName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enabledCloudwatchLogsExports: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    engine: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    finalSnapshotIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    iamDatabaseAuthenticationEnabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    identifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    identifierPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    iops: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    kmsKeyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    licenseModel: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    maintenanceWindow: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    monitoringInterval: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    monitoringRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    multiAz: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    optionGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    parameterGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    password: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    publiclyAccessible: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    replicateSourceDb: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    s3Import: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameBucketPrefixIngestionRole] = null,
    securityGroupNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    skipFinalSnapshot: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    snapshotIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    storageEncrypted: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    storageType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    timezone: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    username: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcSecurityGroupIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): InstanceArgs = {
    val __obj = js.Dynamic.literal(instanceClass = instanceClass.asInstanceOf[js.Any])
    if (allocatedStorage != null) __obj.updateDynamic("allocatedStorage")(allocatedStorage.asInstanceOf[js.Any])
    if (allowMajorVersionUpgrade != null) __obj.updateDynamic("allowMajorVersionUpgrade")(allowMajorVersionUpgrade.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (backupRetentionPeriod != null) __obj.updateDynamic("backupRetentionPeriod")(backupRetentionPeriod.asInstanceOf[js.Any])
    if (backupWindow != null) __obj.updateDynamic("backupWindow")(backupWindow.asInstanceOf[js.Any])
    if (characterSetName != null) __obj.updateDynamic("characterSetName")(characterSetName.asInstanceOf[js.Any])
    if (copyTagsToSnapshot != null) __obj.updateDynamic("copyTagsToSnapshot")(copyTagsToSnapshot.asInstanceOf[js.Any])
    if (dbSubnetGroupName != null) __obj.updateDynamic("dbSubnetGroupName")(dbSubnetGroupName.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainIamRoleName != null) __obj.updateDynamic("domainIamRoleName")(domainIamRoleName.asInstanceOf[js.Any])
    if (enabledCloudwatchLogsExports != null) __obj.updateDynamic("enabledCloudwatchLogsExports")(enabledCloudwatchLogsExports.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (finalSnapshotIdentifier != null) __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier.asInstanceOf[js.Any])
    if (iamDatabaseAuthenticationEnabled != null) __obj.updateDynamic("iamDatabaseAuthenticationEnabled")(iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (identifierPrefix != null) __obj.updateDynamic("identifierPrefix")(identifierPrefix.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (licenseModel != null) __obj.updateDynamic("licenseModel")(licenseModel.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (monitoringInterval != null) __obj.updateDynamic("monitoringInterval")(monitoringInterval.asInstanceOf[js.Any])
    if (monitoringRoleArn != null) __obj.updateDynamic("monitoringRoleArn")(monitoringRoleArn.asInstanceOf[js.Any])
    if (multiAz != null) __obj.updateDynamic("multiAz")(multiAz.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionGroupName != null) __obj.updateDynamic("optionGroupName")(optionGroupName.asInstanceOf[js.Any])
    if (parameterGroupName != null) __obj.updateDynamic("parameterGroupName")(parameterGroupName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (replicateSourceDb != null) __obj.updateDynamic("replicateSourceDb")(replicateSourceDb.asInstanceOf[js.Any])
    if (s3Import != null) __obj.updateDynamic("s3Import")(s3Import.asInstanceOf[js.Any])
    if (securityGroupNames != null) __obj.updateDynamic("securityGroupNames")(securityGroupNames.asInstanceOf[js.Any])
    if (skipFinalSnapshot != null) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot.asInstanceOf[js.Any])
    if (snapshotIdentifier != null) __obj.updateDynamic("snapshotIdentifier")(snapshotIdentifier.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    if (storageType != null) __obj.updateDynamic("storageType")(storageType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
}

