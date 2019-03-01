package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalLocation extends js.Object {
  /**
    * The location of the artifact.
    */
  var artifactLocation: ArtifactLocation
  /**
    * Specifies a portion of the artifact that encloses the region. Allows a viewer to display additional context
    * around the region.
    */
  var contextRegion: js.UndefOr[Region] = js.undefined
  /**
    * Value that distinguishes this physical location from all other physical locations in this run object.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the physical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Specifies a portion of the artifact.
    */
  var region: js.UndefOr[Region] = js.undefined
}

object PhysicalLocation {
  @scala.inline
  def apply(
    artifactLocation: ArtifactLocation,
    contextRegion: Region = null,
    id: scala.Int | scala.Double = null,
    properties: PropertyBag = null,
    region: Region = null
  ): PhysicalLocation = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation)
    if (contextRegion != null) __obj.updateDynamic("contextRegion")(contextRegion)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[PhysicalLocation]
  }
}

