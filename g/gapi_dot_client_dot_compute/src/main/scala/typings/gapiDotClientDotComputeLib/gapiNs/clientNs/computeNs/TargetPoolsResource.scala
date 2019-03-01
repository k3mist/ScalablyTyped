package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Adds an instance to a target pool. */
  def addInstance(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TargetPoolAggregatedList]
  /** Deletes the specified target pool. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetPool]
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetPoolInstanceHealth]
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[TargetPoolList]
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Removes instance URL from a target pool. */
  def removeInstance(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes a backup target pool's configurations. */
  def setBackup(request: gapiDotClientDotComputeLib.Anon_AltFailoverRatio): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    addInstance: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetPoolAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetPool]
    ],
    getHealth: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetPoolInstanceHealth]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetPoolList]
    ],
    removeHealthCheck: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    removeInstance: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdTargetPool, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setBackup: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFailoverRatio, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal(addHealthCheck = addHealthCheck, addInstance = addInstance, aggregatedList = aggregatedList, delete = delete, get = get, getHealth = getHealth, insert = insert, list = list, removeHealthCheck = removeHealthCheck, removeInstance = removeInstance, setBackup = setBackup)
  
    __obj.asInstanceOf[TargetPoolsResource]
  }
}

