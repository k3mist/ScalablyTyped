package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds ForceDirectedLayout-specific information about Nodes.*/
trait ForceDirectedVertex extends LayoutVertex {
  /**Gets or sets the electrical charge for this vertex.*/
  var charge: scala.Double
  /**Gets or sets the cumulative force on the vertex in the X direction.*/
  var forceX: scala.Double
  /**Gets or sets the cumulative force on the vertex in the Y direction.*/
  var forceY: scala.Double
  /**Gets or sets whether the vertex may be moved by any forces.*/
  var isFixed: scala.Boolean
  /**Gets or sets the gravitational mass for this vertex.*/
  var mass: scala.Double
}

object ForceDirectedVertex {
  @scala.inline
  def apply(
    addDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    addSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    bounds: Rect,
    centerX: scala.Double,
    centerY: scala.Double,
    charge: scala.Double,
    commit: js.Function0[scala.Unit],
    data: js.Any,
    deleteDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    deleteSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    destinationEdges: Iterator[LayoutEdge],
    destinationVertexes: Iterator[LayoutVertex],
    edges: Iterator[LayoutEdge],
    edgesCount: scala.Double,
    focus: Point,
    focusX: scala.Double,
    focusY: scala.Double,
    forceX: scala.Double,
    forceY: scala.Double,
    height: scala.Double,
    isFixed: scala.Boolean,
    mass: scala.Double,
    network: LayoutNetwork,
    node: Node,
    sourceEdges: Iterator[LayoutEdge],
    sourceVertexes: Iterator[LayoutVertex],
    vertexes: Iterator[LayoutVertex],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ForceDirectedVertex = {
    val __obj = js.Dynamic.literal(addDestinationEdge = addDestinationEdge, addSourceEdge = addSourceEdge, bounds = bounds, centerX = centerX, centerY = centerY, charge = charge, commit = commit, data = data, deleteDestinationEdge = deleteDestinationEdge, deleteSourceEdge = deleteSourceEdge, destinationEdges = destinationEdges, destinationVertexes = destinationVertexes, edges = edges, edgesCount = edgesCount, focus = focus, focusX = focusX, focusY = focusY, forceX = forceX, forceY = forceY, height = height, isFixed = isFixed, mass = mass, network = network, node = node, sourceEdges = sourceEdges, sourceVertexes = sourceVertexes, vertexes = vertexes, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ForceDirectedVertex]
  }
}

