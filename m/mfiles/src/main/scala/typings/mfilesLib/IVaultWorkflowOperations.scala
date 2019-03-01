package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultWorkflowOperations extends js.Object {
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
  def GetStateTransitionSignatureSettings(FromState: scala.Double, ToState: scala.Double): ISignatureSettings
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: scala.Double): ISignatureSettings
  def GetWorkflowAdmin(WorkflowID: scala.Double): IWorkflowAdmin
  def GetWorkflowForClient(WorkflowID: scala.Double, UpdateFromServer: scala.Boolean): IWorkflow
  def GetWorkflowIDByAlias(Alias: java.lang.String): scala.Double
  def GetWorkflowIDByGUID(WorkflowGUID: java.lang.String): scala.Double
  def GetWorkflowStateIDByAlias(Alias: java.lang.String): scala.Double
  def GetWorkflowStateIDByGUID(StateGUID: java.lang.String): scala.Double
  def GetWorkflowStateTransitionIDByAlias(Alias: java.lang.String): scala.Double
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: java.lang.String): scala.Double
  def GetWorkflowStateTransitions(Workflow: scala.Double, CurrentState: ITypedValue): IStateTransitionsForClient
  def GetWorkflowStateTransitionsAsJSON(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): java.lang.String
  def GetWorkflowStateTransitionsEx(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient
  def GetWorkflowStates(Workflow: scala.Double, CurrentState: ITypedValue): IStates
  def GetWorkflowStatesEx(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates
  def GetWorkflowsAdmin(): IWorkflowsAdmin
  def GetWorkflowsAsValueListItems(UpdateFromServer: scala.Boolean): IValueListItems
  def GetWorkflowsForClient(UpdateFromServer: scala.Boolean): IWorkflows
  def RemoveWorkflowAdmin(WorkflowID: scala.Double): scala.Unit
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
}

object IVaultWorkflowOperations {
  @scala.inline
  def apply(
    AddWorkflowAdmin: js.Function1[IWorkflowAdmin, IWorkflowAdmin],
    GetStateTransitionSignatureSettings: js.Function2[scala.Double, scala.Double, ISignatureSettings],
    GetStateTransitionSignatureSettingsByID: js.Function1[scala.Double, ISignatureSettings],
    GetWorkflowAdmin: js.Function1[scala.Double, IWorkflowAdmin],
    GetWorkflowForClient: js.Function2[scala.Double, scala.Boolean, IWorkflow],
    GetWorkflowIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetWorkflowIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateTransitionIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateTransitionIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateTransitions: js.Function2[scala.Double, ITypedValue, IStateTransitionsForClient],
    GetWorkflowStateTransitionsAsJSON: js.Function3[scala.Double, ITypedValue, IObjVer, java.lang.String],
    GetWorkflowStateTransitionsEx: js.Function3[scala.Double, ITypedValue, IObjVer, IStateTransitionsForClient],
    GetWorkflowStates: js.Function2[scala.Double, ITypedValue, IStates],
    GetWorkflowStatesEx: js.Function3[scala.Double, ITypedValue, IObjVer, IStates],
    GetWorkflowsAdmin: js.Function0[IWorkflowsAdmin],
    GetWorkflowsAsValueListItems: js.Function1[scala.Boolean, IValueListItems],
    GetWorkflowsForClient: js.Function1[scala.Boolean, IWorkflows],
    RemoveWorkflowAdmin: js.Function1[scala.Double, scala.Unit],
    UpdateWorkflowAdmin: js.Function1[IWorkflowAdmin, IWorkflowAdmin]
  ): IVaultWorkflowOperations = {
    val __obj = js.Dynamic.literal(AddWorkflowAdmin = AddWorkflowAdmin, GetStateTransitionSignatureSettings = GetStateTransitionSignatureSettings, GetStateTransitionSignatureSettingsByID = GetStateTransitionSignatureSettingsByID, GetWorkflowAdmin = GetWorkflowAdmin, GetWorkflowForClient = GetWorkflowForClient, GetWorkflowIDByAlias = GetWorkflowIDByAlias, GetWorkflowIDByGUID = GetWorkflowIDByGUID, GetWorkflowStateIDByAlias = GetWorkflowStateIDByAlias, GetWorkflowStateIDByGUID = GetWorkflowStateIDByGUID, GetWorkflowStateTransitionIDByAlias = GetWorkflowStateTransitionIDByAlias, GetWorkflowStateTransitionIDByGUID = GetWorkflowStateTransitionIDByGUID, GetWorkflowStateTransitions = GetWorkflowStateTransitions, GetWorkflowStateTransitionsAsJSON = GetWorkflowStateTransitionsAsJSON, GetWorkflowStateTransitionsEx = GetWorkflowStateTransitionsEx, GetWorkflowStates = GetWorkflowStates, GetWorkflowStatesEx = GetWorkflowStatesEx, GetWorkflowsAdmin = GetWorkflowsAdmin, GetWorkflowsAsValueListItems = GetWorkflowsAsValueListItems, GetWorkflowsForClient = GetWorkflowsForClient, RemoveWorkflowAdmin = RemoveWorkflowAdmin, UpdateWorkflowAdmin = UpdateWorkflowAdmin)
  
    __obj.asInstanceOf[IVaultWorkflowOperations]
  }
}

