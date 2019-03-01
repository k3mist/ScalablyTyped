package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. The activation policy cannot
    * be updated together with other settings for Second Generation instances. Valid values:
    * ALWAYS: The instance is on; it is not deactivated by inactivity.
    * NEVER: The instance is off; it is not activated, even if a connection request arrives.
    * ON_DEMAND: The instance responds to incoming requests, and turns itself off when not in use. Instances with PER_USE pricing turn off after 15 minutes
    * of inactivity. Instances with PER_PACKAGE pricing turn off after 12 hours of inactivity.
    */
  var activationPolicy: js.UndefOr[java.lang.String] = js.undefined
  /** The App Engine app IDs that can access this instance. This property is only applicable to First Generation instances. */
  var authorizedGaeApplications: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Reserved for future use. */
  var availabilityType: js.UndefOr[java.lang.String] = js.undefined
  /** The daily backup configuration for the instance. */
  var backupConfiguration: js.UndefOr[BackupConfiguration] = js.undefined
  /**
    * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property is only
    * applicable to First Generation instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The size of data disk, in GB. The data disk size minimum is 10GB. Applies only to Second Generation instances. */
  var dataDiskSizeGb: js.UndefOr[java.lang.String] = js.undefined
  /** The type of data disk. Only supported for Second Generation instances. The default type is PD_SSD. Applies only to Second Generation instances. */
  var dataDiskType: js.UndefOr[java.lang.String] = js.undefined
  /** The database flags passed to the instance at startup. */
  var databaseFlags: js.UndefOr[js.Array[DatabaseFlags]] = js.undefined
  /** Configuration specific to read replica instances. Indicates whether replication is enabled or not. */
  var databaseReplicationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The
    * IPv4 address cannot be disabled for Second Generation instances.
    */
  var ipConfiguration: js.UndefOr[IpConfiguration] = js.undefined
  /** This is always sql#settings. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or GCE zone for better
    * performance. App Engine co-location is only applicable to First Generation instances.
    */
  var locationPreference: js.UndefOr[LocationPreference] = js.undefined
  /**
    * The maintenance window for this instance. This specifies when the instance may be restarted for maintenance purposes. Applies only to Second Generation
    * instances.
    */
  var maintenanceWindow: js.UndefOr[MaintenanceWindow] = js.undefined
  /** The pricing plan for this instance. This can be either PER_USE or PACKAGE. Only PER_USE is supported for Second Generation instances. */
  var pricingPlan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS. This property is only applicable to First Generation
    * instances.
    */
  var replicationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use
    * the most recent settingsVersion value for this instance and do not try to update this value.
    */
  var settingsVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration to increase storage size automatically. The default value is true. Applies only to Second Generation instances. */
  var storageAutoResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit. Applies only
    * to Second Generation instances.
    */
  var storageAutoResizeLimit: js.UndefOr[java.lang.String] = js.undefined
  /** The tier of service for this instance, for example D1, D2. For more information, see pricing. */
  var tier: js.UndefOr[java.lang.String] = js.undefined
  /** User-provided labels, represented as a dictionary where each label is a single key value pair. */
  var userLabels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    activationPolicy: java.lang.String = null,
    authorizedGaeApplications: js.Array[java.lang.String] = null,
    availabilityType: java.lang.String = null,
    backupConfiguration: BackupConfiguration = null,
    crashSafeReplicationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    dataDiskSizeGb: java.lang.String = null,
    dataDiskType: java.lang.String = null,
    databaseFlags: js.Array[DatabaseFlags] = null,
    databaseReplicationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ipConfiguration: IpConfiguration = null,
    kind: java.lang.String = null,
    locationPreference: LocationPreference = null,
    maintenanceWindow: MaintenanceWindow = null,
    pricingPlan: java.lang.String = null,
    replicationType: java.lang.String = null,
    settingsVersion: java.lang.String = null,
    storageAutoResize: js.UndefOr[scala.Boolean] = js.undefined,
    storageAutoResizeLimit: java.lang.String = null,
    tier: java.lang.String = null,
    userLabels: stdLib.Record[java.lang.String, java.lang.String] = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (activationPolicy != null) __obj.updateDynamic("activationPolicy")(activationPolicy)
    if (authorizedGaeApplications != null) __obj.updateDynamic("authorizedGaeApplications")(authorizedGaeApplications)
    if (availabilityType != null) __obj.updateDynamic("availabilityType")(availabilityType)
    if (backupConfiguration != null) __obj.updateDynamic("backupConfiguration")(backupConfiguration)
    if (!js.isUndefined(crashSafeReplicationEnabled)) __obj.updateDynamic("crashSafeReplicationEnabled")(crashSafeReplicationEnabled)
    if (dataDiskSizeGb != null) __obj.updateDynamic("dataDiskSizeGb")(dataDiskSizeGb)
    if (dataDiskType != null) __obj.updateDynamic("dataDiskType")(dataDiskType)
    if (databaseFlags != null) __obj.updateDynamic("databaseFlags")(databaseFlags)
    if (!js.isUndefined(databaseReplicationEnabled)) __obj.updateDynamic("databaseReplicationEnabled")(databaseReplicationEnabled)
    if (ipConfiguration != null) __obj.updateDynamic("ipConfiguration")(ipConfiguration)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locationPreference != null) __obj.updateDynamic("locationPreference")(locationPreference)
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow)
    if (pricingPlan != null) __obj.updateDynamic("pricingPlan")(pricingPlan)
    if (replicationType != null) __obj.updateDynamic("replicationType")(replicationType)
    if (settingsVersion != null) __obj.updateDynamic("settingsVersion")(settingsVersion)
    if (!js.isUndefined(storageAutoResize)) __obj.updateDynamic("storageAutoResize")(storageAutoResize)
    if (storageAutoResizeLimit != null) __obj.updateDynamic("storageAutoResizeLimit")(storageAutoResizeLimit)
    if (tier != null) __obj.updateDynamic("tier")(tier)
    if (userLabels != null) __obj.updateDynamic("userLabels")(userLabels)
    __obj.asInstanceOf[Settings]
  }
}

