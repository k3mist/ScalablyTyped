package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the TreeView extension.
  */
trait MVCxClientTreeView extends ASPxClientTreeView {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientTreeView: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTreeView]]
}

object MVCxClientTreeView {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    BeginCallback: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: () => scala.Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: () => scala.Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetNode: scala.Double => ASPxClientTreeViewNode,
    GetNodeByName: java.lang.String => ASPxClientTreeViewNode,
    GetNodeByText: java.lang.String => ASPxClientTreeViewNode,
    GetNodeCount: () => scala.Double,
    GetParentControl: () => js.Object,
    GetRootNode: () => ASPxClientTreeViewNode,
    GetSelectedNode: () => ASPxClientTreeViewNode,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetSelectedNode: ASPxClientTreeViewNode => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): MVCxClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, CheckedChanged = CheckedChanged, CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback, ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootNode = js.Any.fromFunction0(GetRootNode), GetSelectedNode = js.Any.fromFunction0(GetSelectedNode), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, NodeClick = NodeClick, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedNode = js.Any.fromFunction1(SetSelectedNode), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[MVCxClientTreeView]
  }
}

