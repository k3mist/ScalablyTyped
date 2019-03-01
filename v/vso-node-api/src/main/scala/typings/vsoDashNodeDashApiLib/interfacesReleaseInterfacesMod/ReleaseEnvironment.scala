package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironment extends js.Object {
  /**
    * Gets list of conditions.
    */
  var conditions: js.Array[ReleaseCondition]
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets definition environment id.
    */
  var definitionEnvironmentId: scala.Double
  /**
    * Gets demands.
    */
  var demands: js.Array[_]
  /**
    * Gets list of deploy phases snapshot.
    */
  var deployPhasesSnapshot: js.Array[DeployPhase]
  /**
    * Gets deploy steps.
    */
  var deploySteps: js.Array[DeploymentAttempt]
  /**
    * Gets environment options.
    */
  var environmentOptions: EnvironmentOptions
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: stdLib.Date
  /**
    * Gets name.
    */
  var name: java.lang.String
  /**
    * Gets next scheduled UTC time.
    */
  var nextScheduledUtcTime: stdLib.Date
  /**
    * Gets the identity who is owner for release environment.
    */
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets list of post deploy approvals snapshot.
    */
  var postApprovalsSnapshot: ReleaseDefinitionApprovals
  /**
    * Gets list of post deploy approvals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval]
  var postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep
  /**
    * Gets list of pre deploy approvals snapshot.
    */
  var preApprovalsSnapshot: ReleaseDefinitionApprovals
  /**
    * Gets list of pre deploy approvals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval]
  var preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep
  /**
    * Gets process parameters.
    */
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  /**
    * Gets queue id.
    */
  var queueId: scala.Double
  /**
    * Gets rank.
    */
  var rank: scala.Double
  /**
    * Gets release reference which specifies the reference of the release to which this release environment is associated.
    */
  var release: ReleaseShallowReference
  /**
    * Gets the identity who created release.
    */
  var releaseCreatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release environment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
    * Gets release description.
    */
  var releaseDescription: java.lang.String
  /**
    * Gets release id.
    */
  var releaseId: scala.Double
  /**
    * Gets schedule deployment time of release environment.
    */
  var scheduledDeploymentTime: stdLib.Date
  /**
    * Gets list of schedules.
    */
  var schedules: js.Array[ReleaseSchedule]
  /**
    * Gets environment status.
    */
  var status: EnvironmentStatus
  /**
    * Gets time to deploy.
    */
  var timeToDeploy: scala.Double
  /**
    * Gets trigger reason.
    */
  var triggerReason: java.lang.String
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup]
  /**
    * Gets the dictionary of variables.
    */
  var variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
  /**
    * Gets list of workflow tasks.
    */
  var workflowTasks: js.Array[WorkflowTask]
}

object ReleaseEnvironment {
  @scala.inline
  def apply(
    conditions: js.Array[ReleaseCondition],
    createdOn: stdLib.Date,
    definitionEnvironmentId: scala.Double,
    demands: js.Array[_],
    deployPhasesSnapshot: js.Array[DeployPhase],
    deploySteps: js.Array[DeploymentAttempt],
    environmentOptions: EnvironmentOptions,
    id: scala.Double,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    nextScheduledUtcTime: stdLib.Date,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    postApprovalsSnapshot: ReleaseDefinitionApprovals,
    postDeployApprovals: js.Array[ReleaseApproval],
    postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep,
    preApprovalsSnapshot: ReleaseDefinitionApprovals,
    preDeployApprovals: js.Array[ReleaseApproval],
    preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep,
    processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters,
    queueId: scala.Double,
    rank: scala.Double,
    release: ReleaseShallowReference,
    releaseCreatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseDescription: java.lang.String,
    releaseId: scala.Double,
    scheduledDeploymentTime: stdLib.Date,
    schedules: js.Array[ReleaseSchedule],
    status: EnvironmentStatus,
    timeToDeploy: scala.Double,
    triggerReason: java.lang.String,
    variableGroups: js.Array[VariableGroup],
    variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue],
    workflowTasks: js.Array[WorkflowTask]
  ): ReleaseEnvironment = {
    val __obj = js.Dynamic.literal(conditions = conditions, createdOn = createdOn, definitionEnvironmentId = definitionEnvironmentId, demands = demands, deployPhasesSnapshot = deployPhasesSnapshot, deploySteps = deploySteps, environmentOptions = environmentOptions, id = id, modifiedOn = modifiedOn, name = name, nextScheduledUtcTime = nextScheduledUtcTime, owner = owner, postApprovalsSnapshot = postApprovalsSnapshot, postDeployApprovals = postDeployApprovals, postDeploymentGatesSnapshot = postDeploymentGatesSnapshot, preApprovalsSnapshot = preApprovalsSnapshot, preDeployApprovals = preDeployApprovals, preDeploymentGatesSnapshot = preDeploymentGatesSnapshot, processParameters = processParameters, queueId = queueId, rank = rank, release = release, releaseCreatedBy = releaseCreatedBy, releaseDefinition = releaseDefinition, releaseDescription = releaseDescription, releaseId = releaseId, scheduledDeploymentTime = scheduledDeploymentTime, schedules = schedules, status = status, timeToDeploy = timeToDeploy, triggerReason = triggerReason, variableGroups = variableGroups, variables = variables, workflowTasks = workflowTasks)
  
    __obj.asInstanceOf[ReleaseEnvironment]
  }
}

