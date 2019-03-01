package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceDefinition extends js.Object {
  /**
    * Enable maintenance
    */
  var enabled: scala.Boolean
  /**
    * Id
    */
  var id: scala.Double
  /**
    * Maintenance job timeout per agent
    */
  var jobTimeoutInMinutes: scala.Double
  /**
    * Max percentage of agents within a pool running maintenance job at given time
    */
  var maxConcurrentAgentsPercentage: scala.Double
  var options: TaskAgentPoolMaintenanceOptions
  /**
    * Pool reference for the maintenance definition
    */
  var pool: TaskAgentPoolReference
  var retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy
  var scheduleSetting: TaskAgentPoolMaintenanceSchedule
}

object TaskAgentPoolMaintenanceDefinition {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    id: scala.Double,
    jobTimeoutInMinutes: scala.Double,
    maxConcurrentAgentsPercentage: scala.Double,
    options: TaskAgentPoolMaintenanceOptions,
    pool: TaskAgentPoolReference,
    retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy,
    scheduleSetting: TaskAgentPoolMaintenanceSchedule
  ): TaskAgentPoolMaintenanceDefinition = {
    val __obj = js.Dynamic.literal(enabled = enabled, id = id, jobTimeoutInMinutes = jobTimeoutInMinutes, maxConcurrentAgentsPercentage = maxConcurrentAgentsPercentage, options = options, pool = pool, retentionPolicy = retentionPolicy, scheduleSetting = scheduleSetting)
  
    __obj.asInstanceOf[TaskAgentPoolMaintenanceDefinition]
  }
}

