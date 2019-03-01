package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPool extends TaskAgentPoolReference {
  /**
    * Gets the administrators group for this agent pool.
    */
  var administratorsGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets a value indicating whether or not a queue should be automatically provisioned for each project collection or not.
    */
  var autoProvision: scala.Boolean
  /**
    * Gets the identity who created this pool. The creator of the pool is automatically added into the administrators group for the pool on creation.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets the date/time of the pool creation.
    */
  var createdOn: stdLib.Date
  /**
    * Gets the scope identifier for groups/roles which are owned by this pool.
    */
  var groupScopeId: java.lang.String
  var properties: js.Any
  /**
    * Gets a value indicating whether or not roles have been provisioned for this pool.
    */
  var provisioned: scala.Boolean
  /**
    * Gets the service accounts group for this agent pool.
    */
  var serviceAccountsGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets the current size of the pool.
    */
  var size: scala.Double
}

object TaskAgentPool {
  @scala.inline
  def apply(
    administratorsGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    autoProvision: scala.Boolean,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    groupScopeId: java.lang.String,
    id: scala.Double,
    isHosted: scala.Boolean,
    name: java.lang.String,
    poolType: TaskAgentPoolType,
    properties: js.Any,
    provisioned: scala.Boolean,
    scope: java.lang.String,
    serviceAccountsGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    size: scala.Double
  ): TaskAgentPool = {
    val __obj = js.Dynamic.literal(administratorsGroup = administratorsGroup, autoProvision = autoProvision, createdBy = createdBy, createdOn = createdOn, groupScopeId = groupScopeId, id = id, isHosted = isHosted, name = name, poolType = poolType, properties = properties, provisioned = provisioned, scope = scope, serviceAccountsGroup = serviceAccountsGroup, size = size)
  
    __obj.asInstanceOf[TaskAgentPool]
  }
}

