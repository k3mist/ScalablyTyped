package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GceClusterConfig extends js.Object {
  /**
    * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses,
    * and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled
    * networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
    */
  var internalIpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Google Compute Engine metadata entries to add to all instances (see Project and instance metadata
    * (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
    */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Optional. The Google Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor
    * subnetwork_uri is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using Subnetworks for
    * more information).A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
    * projects/[project_id]/regions/global/default
    * default
    */
  var networkUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The service account of the instances. Defaults to the default Google Compute Engine service account. Custom service accounts need permissions
    * equivalent to the folloing IAM roles:
    * roles/logging.logWriter
    * roles/storage.objectAdmin(see https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts for more information). Example:
    * [account_id]@[project_id].iam.gserviceaccount.com
    */
  var serviceAccount: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The URIs of service account scopes to be included in Google Compute Engine instances. The following base set of scopes is always included:
    * https://www.googleapis.com/auth/cloud.useraccounts.readonly
    * https://www.googleapis.com/auth/devstorage.read_write
    * https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided:
    * https://www.googleapis.com/auth/bigquery
    * https://www.googleapis.com/auth/bigtable.admin.table
    * https://www.googleapis.com/auth/bigtable.data
    * https://www.googleapis.com/auth/devstorage.full_control
    */
  var serviceAccountScopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Optional. The Google Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or
    * short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/sub0
    * projects/[project_id]/regions/us-east1/sub0
    * sub0
    */
  var subnetworkUri: js.UndefOr[java.lang.String] = js.undefined
  /** The Google Compute Engine tags to add to all instances (see Tagging instances). */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Optional. The zone where the Google Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a
    * non-global Cloud Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be
    * present.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]
    * projects/[project_id]/zones/[zone]
    * us-central1-f
    */
  var zoneUri: js.UndefOr[java.lang.String] = js.undefined
}

object GceClusterConfig {
  @scala.inline
  def apply(
    internalIpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: stdLib.Record[java.lang.String, java.lang.String] = null,
    networkUri: java.lang.String = null,
    serviceAccount: java.lang.String = null,
    serviceAccountScopes: js.Array[java.lang.String] = null,
    subnetworkUri: java.lang.String = null,
    tags: js.Array[java.lang.String] = null,
    zoneUri: java.lang.String = null
  ): GceClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(internalIpOnly)) __obj.updateDynamic("internalIpOnly")(internalIpOnly)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (networkUri != null) __obj.updateDynamic("networkUri")(networkUri)
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount)
    if (serviceAccountScopes != null) __obj.updateDynamic("serviceAccountScopes")(serviceAccountScopes)
    if (subnetworkUri != null) __obj.updateDynamic("subnetworkUri")(subnetworkUri)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (zoneUri != null) __obj.updateDynamic("zoneUri")(zoneUri)
    __obj.asInstanceOf[GceClusterConfig]
  }
}

