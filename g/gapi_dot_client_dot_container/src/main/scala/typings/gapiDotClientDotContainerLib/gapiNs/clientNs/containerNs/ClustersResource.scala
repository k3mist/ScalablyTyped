package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  var nodePools: NodePoolsResource
  /** Sets the addons of a specific cluster. */
  def addons(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Completes master IP rotation. */
  def completeIpRotation(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Creates a cluster, consisting of the specified number and type of Google
    * Compute Engine instances.
    *
    * By default, the cluster is created in the project's
    * [default network](/compute/docs/networks-and-firewalls#networks).
    *
    * One firewall is added for the cluster. After cluster creation,
    * the cluster creates routes for each node to allow the containers
    * on that node to communicate with all other instances in the
    * cluster.
    *
    * Finally, an entry is added to the project's global metadata indicating
    * which CIDR range is being used by the cluster.
    */
  def create(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Deletes the cluster, including the Kubernetes endpoint and all worker
    * nodes.
    *
    * Firewalls and routes that were configured during cluster creation
    * are also deleted.
    *
    * Other Google Compute Engine resources that might be in use by the cluster
    * (e.g. load balancer resources) will not be deleted if they weren't present
    * at the initial create time.
    */
  def delete(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the details of a specific cluster. */
  def get(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Cluster]
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Lists all clusters owned by a project in either the specified zone or all
    * zones.
    */
  def list(request: gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse]
  /** Sets the locations of a specific cluster. */
  def locations(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the logging service of a specific cluster. */
  def logging(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the master of a specific cluster. */
  def master(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the monitoring service of a specific cluster. */
  def monitoring(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets labels on a cluster. */
  def resourceLabels(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Used to set master auth materials. Currently supports :-
    * Changing the admin password of a specific cluster.
    * This can be either via password generation or explicitly set the password.
    */
  def setMasterAuth(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Enables/Disables Network Policy for a cluster. */
  def setNetworkPolicy(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Start master IP rotation. */
  def startIpRotation(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the settings of a specific cluster. */
  def update(request: gapiDotClientDotContainerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    addons: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    completeIpRotation: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    create: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Cluster]
    ],
    legacyAbac: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListClustersResponse]
    ],
    locations: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    logging: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    master: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    monitoring: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    nodePools: NodePoolsResource,
    resourceLabels: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setMaintenancePolicy: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setMasterAuth: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setNetworkPolicy: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    startIpRotation: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotContainerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(addons = addons, completeIpRotation = completeIpRotation, create = create, delete = delete, get = get, legacyAbac = legacyAbac, list = list, locations = locations, logging = logging, master = master, monitoring = monitoring, nodePools = nodePools, resourceLabels = resourceLabels, setMaintenancePolicy = setMaintenancePolicy, setMasterAuth = setMasterAuth, setNetworkPolicy = setNetworkPolicy, startIpRotation = startIpRotation, update = update)
  
    __obj.asInstanceOf[ClustersResource]
  }
}

