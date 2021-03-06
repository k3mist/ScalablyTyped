package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Each <Titanium.XML.Document> has a `doctype` attribute whose value is either 'null' or a <Titanium.XML.DocumentType> object.
		 */
trait DocumentType
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Attr](Titanium.XML.Attr) node.
  			 */
  val ATTRIBUTE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [CDATASection](Titanium.XML.CDATASection) node.
  			 */
  val CDATA_SECTION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Comment](Titanium.XML.Comment) node.
  			 */
  val COMMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentFragment](Titanium.XML.DocumentFragment) node.
  			 */
  val DOCUMENT_FRAGMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Document](Titanium.XML.Document) node.
  			 */
  val DOCUMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentType](Titanium.XML.DocumentType) node.
  			 */
  val DOCUMENT_TYPE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Element](Titanium.XML.Element) node.
  			 */
  val ELEMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Entity](Titanium.XML.Entity) node.
  			 */
  val ENTITY_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [EntityReference](Titanium.XML.EntityReference) node.
  			 */
  val ENTITY_REFERENCE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Notation](Titanium.XML.Notation) node.
  			 */
  val NOTATION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [ProcessingInstruction](Titanium.XML.ProcessingInstruction) node.
  			 */
  val PROCESSING_INSTRUCTION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Text](Titanium.XML.Text) node.
  			 */
  val TEXT_NODE: scala.Double
  /**
  			 * A map of this node's attributes.
  			 */
  val attributes: NamedNodeMap
  /**
  			 * A <Titanium.XML.NodeList> of this node's children.
  			 */
  val childNodes: NodeList
  /**
  			 * A <Titanium.XML.NamedNodeMap> containing the general entities, both external and internal, declared in the DTD. Parameter entities are not contained. Duplicates are discarded.
  			 */
  val entities: NamedNodeMap
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * The internal subset as a string.
  			 */
  val internalSubset: java.lang.String
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
  /**
  			 * Local part of the qualified name of this node.
  			 */
  var localName: java.lang.String
  /**
  			 * The name of DTD; i.e., the name immediately following the `DOCTYPE` keyword.
  			 */
  val name: java.lang.String
  /**
  			 * Namespace URI of this node.
  			 */
  val namespaceURI: java.lang.String
  /**
  			 * This node's next sibling.
  			 */
  val nextSibling: Node
  /**
  			 * Name of this node.
  			 */
  val nodeName: java.lang.String
  /**
  			 * This node's type. One of `ELEMENT_NODE`, `ATTRIBUTE_NODE`, `TEXT_NODE`, `CDATA_SECTION_NODE`,
  			 * `ENTITY_REFERENCE_NODE`, `ENTITY_NODE`, `PROCESSING_INSTRUCTION_NODE`, `COMMENT_NODE`,
  			 * `DOCUMENT_NODE`, `DOCUMENT_TYPE_NODE`, `DOCUMENT_FRAGMENT_NODE`, `NOTATION_NODE`.
  			 */
  val nodeType: scala.Double
  /**
  			 * Content (value) of this node.
  			 */
  var nodeValue: java.lang.String
  /**
  			 * A <Titanium.XML.NamedNodeMap> containing the notations declared in the DTD. Duplicates are discarded. Every node in this map also implements the <Titanium.XML.Notation> interface.
  			 */
  val notations: NamedNodeMap
  /**
  			 * This node's owning document.
  			 */
  val ownerDocument: Document
  /**
  			 * This node's parent node.
  			 */
  val parentNode: Node
  /**
  			 * Namespace prefix of this node.
  			 */
  var prefix: java.lang.String
  /**
  			 * This node's previous sibling.
  			 */
  val previousSibling: Node
  /**
  			 * The public identifier of the external subset.
  			 */
  val publicId: java.lang.String
  /**
  			 * The system identifier of the external subset.
  			 */
  val systemId: java.lang.String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val text: java.lang.String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val textContent: java.lang.String
  /**
  			 * Appends the node `newChild` as a child of this node.
  			 */
  def appendChild(newChild: Node): Node
  /**
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: scala.Boolean): Node
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.entities> property.
  			 */
  def getEntities(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.internalSubset> property.
  			 */
  def getInternalSubset(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.name> property.
  			 */
  def getName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.notations> property.
  			 */
  def getNotations(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.publicId> property.
  			 */
  def getPublicId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.systemId> property.
  			 */
  def getSystemId(): java.lang.String
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): scala.Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): scala.Boolean
  /**
  			 * Inserts the node `newChild` before the node `refChild`.
  			 */
  def insertBefore(newChild: Node, refChild: Node): Node
  /**
  			 * Tests whether the DOM implementation supports a specific feature.
  			 */
  def isSupported(feature: java.lang.String, version: java.lang.String): scala.Boolean
  /**
  			 * Normalizes text and attribute nodes in this node's child hierarchy.
  			 */
  def normalize(): scala.Unit
  /**
  			 * Removes a child node from this node.
  			 */
  def removeChild(oldChild: Node): Node
  /**
  			 * Replaces the node `oldChild` with the node `newChild`.
  			 */
  def replaceChild(newChild: Node, oldChild: Node): Node
}

object DocumentType {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: scala.Double,
    CDATA_SECTION_NODE: scala.Double,
    COMMENT_NODE: scala.Double,
    DOCUMENT_FRAGMENT_NODE: scala.Double,
    DOCUMENT_NODE: scala.Double,
    DOCUMENT_TYPE_NODE: scala.Double,
    ELEMENT_NODE: scala.Double,
    ENTITY_NODE: scala.Double,
    ENTITY_REFERENCE_NODE: scala.Double,
    NOTATION_NODE: scala.Double,
    PROCESSING_INSTRUCTION_NODE: scala.Double,
    TEXT_NODE: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    appendChild: Node => Node,
    applyProperties: js.Any => scala.Unit,
    attributes: NamedNodeMap,
    bubbleParent: scala.Boolean,
    childNodes: NodeList,
    cloneNode: scala.Boolean => Node,
    entities: NamedNodeMap,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    firstChild: Node,
    getApiName: () => java.lang.String,
    getAttributes: () => NamedNodeMap,
    getBubbleParent: () => scala.Boolean,
    getEntities: () => NamedNodeMap,
    getInternalSubset: () => java.lang.String,
    getName: () => java.lang.String,
    getNotations: () => NamedNodeMap,
    getPublicId: () => java.lang.String,
    getSystemId: () => java.lang.String,
    hasAttributes: () => scala.Boolean,
    hasChildNodes: () => scala.Boolean,
    insertBefore: (Node, Node) => Node,
    internalSubset: java.lang.String,
    isSupported: (java.lang.String, java.lang.String) => scala.Boolean,
    lastChild: Node,
    localName: java.lang.String,
    name: java.lang.String,
    namespaceURI: java.lang.String,
    nextSibling: Node,
    nodeName: java.lang.String,
    nodeType: scala.Double,
    nodeValue: java.lang.String,
    normalize: () => scala.Unit,
    notations: NamedNodeMap,
    ownerDocument: Document,
    parentNode: Node,
    prefix: java.lang.String,
    previousSibling: Node,
    publicId: java.lang.String,
    removeChild: Node => Node,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    replaceChild: (Node, Node) => Node,
    setBubbleParent: scala.Boolean => scala.Unit,
    systemId: java.lang.String,
    text: java.lang.String,
    textContent: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DocumentType = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE, CDATA_SECTION_NODE = CDATA_SECTION_NODE, COMMENT_NODE = COMMENT_NODE, DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE, DOCUMENT_NODE = DOCUMENT_NODE, DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE, ELEMENT_NODE = ELEMENT_NODE, ENTITY_NODE = ENTITY_NODE, ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE, NOTATION_NODE = NOTATION_NODE, PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE, TEXT_NODE = TEXT_NODE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, appendChild = js.Any.fromFunction1(appendChild), applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes, bubbleParent = bubbleParent, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), entities = entities, fireEvent = js.Any.fromFunction2(fireEvent), firstChild = firstChild, getApiName = js.Any.fromFunction0(getApiName), getAttributes = js.Any.fromFunction0(getAttributes), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEntities = js.Any.fromFunction0(getEntities), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getName = js.Any.fromFunction0(getName), getNotations = js.Any.fromFunction0(getNotations), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), internalSubset = internalSubset, isSupported = js.Any.fromFunction2(isSupported), lastChild = lastChild, localName = localName, name = name, namespaceURI = namespaceURI, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), notations = notations, ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, publicId = publicId, removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), setBubbleParent = js.Any.fromFunction1(setBubbleParent), systemId = systemId, text = text, textContent = textContent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DocumentType]
  }
}

