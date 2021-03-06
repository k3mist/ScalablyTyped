package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance implementing this interface represents the model data for an entry in a {@link XTreeDataModel} .
  *
  * The {@link TreeControl} uses this interface to retrieve the model information needed to display a hierarchical outline
  *
  * Each {@link XTreeNode} in a {@link XTreeDataModel} must be unique.
  */
trait XTreeNode extends js.Object {
  /** Returns the number of child nodes. */
  val ChildCount: scala.Double
  /**
    * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
    */
  val CollapsedGraphicURL: java.lang.String
  /** If not empty, the textual representation of this any is used as the text part of this node. */
  val DisplayValue: js.Any
  /**
    * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
    */
  val ExpandedGraphicURL: java.lang.String
  /**
    * The URL for a graphic that is rendered before the text part of this node.
    *
    * If this URL is empty, no graphic is rendered.
    */
  val NodeGraphicURL: java.lang.String
  /** Returns the parent node of this node. */
  val Parent: XTreeNode
  /**
    * Returns the child tree node at **Index** .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or equal or greater then {@link getChildCount()} .
    */
  def getChildAt(Index: scala.Double): XTreeNode
  /** Returns the number of child nodes. */
  def getChildCount(): scala.Double
  /**
    * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
    */
  def getCollapsedGraphicURL(): java.lang.String
  /** If not empty, the textual representation of this any is used as the text part of this node. */
  def getDisplayValue(): js.Any
  /**
    * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
    */
  def getExpandedGraphicURL(): java.lang.String
  /**
    * Returns the index of **Node** in this instances children.
    * @returns The child index of **Node** , or -1 if **Node** is no child of this instance.
    */
  def getIndex(Node: XTreeNode): scala.Double
  /**
    * The URL for a graphic that is rendered before the text part of this node.
    *
    * If this URL is empty, no graphic is rendered.
    */
  def getNodeGraphicURL(): java.lang.String
  /** Returns the parent node of this node. */
  def getParent(): XTreeNode
  /**
    * Returns `TRUE` if the children of this node are created on demand.
    *
    * A {@link TreeControl} will handle a node that returns `TRUE` always like a node that has child nodes, even if {@link getChildCount()} returns 0.
    * @see TreeExpansionListener;
    */
  def hasChildrenOnDemand(): scala.Boolean
}

object XTreeNode {
  @scala.inline
  def apply(
    ChildCount: scala.Double,
    CollapsedGraphicURL: java.lang.String,
    DisplayValue: js.Any,
    ExpandedGraphicURL: java.lang.String,
    NodeGraphicURL: java.lang.String,
    Parent: XTreeNode,
    getChildAt: scala.Double => XTreeNode,
    getChildCount: () => scala.Double,
    getCollapsedGraphicURL: () => java.lang.String,
    getDisplayValue: () => js.Any,
    getExpandedGraphicURL: () => java.lang.String,
    getIndex: XTreeNode => scala.Double,
    getNodeGraphicURL: () => java.lang.String,
    getParent: () => XTreeNode,
    hasChildrenOnDemand: () => scala.Boolean
  ): XTreeNode = {
    val __obj = js.Dynamic.literal(ChildCount = ChildCount, CollapsedGraphicURL = CollapsedGraphicURL, DisplayValue = DisplayValue, ExpandedGraphicURL = ExpandedGraphicURL, NodeGraphicURL = NodeGraphicURL, Parent = Parent, getChildAt = js.Any.fromFunction1(getChildAt), getChildCount = js.Any.fromFunction0(getChildCount), getCollapsedGraphicURL = js.Any.fromFunction0(getCollapsedGraphicURL), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getExpandedGraphicURL = js.Any.fromFunction0(getExpandedGraphicURL), getIndex = js.Any.fromFunction1(getIndex), getNodeGraphicURL = js.Any.fromFunction0(getNodeGraphicURL), getParent = js.Any.fromFunction0(getParent), hasChildrenOnDemand = js.Any.fromFunction0(hasChildrenOnDemand))
  
    __obj.asInstanceOf[XTreeNode]
  }
}

