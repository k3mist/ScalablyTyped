package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapProperties extends LoadableProperties {
  /**
    * A collection of tile layers that make up the basemap's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers)
    */
  var baseLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  /**
    * An identifier used to refer to the basemap when referencing it elsewhere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * A collection of tiled reference layers for displaying labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers)
    */
  var referenceLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  /**
    * The URL pointing to an image that represents the basemap. When using a custom basemap in the [BasemapToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html) widget, the image specified here will display in the widget. When the user clicks the image, the map's basemap will update to the basemap associated with the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object BasemapProperties {
  @scala.inline
  def apply(
    baseLayers: CollectionProperties[LayerProperties] = null,
    id: java.lang.String = null,
    portalItem: PortalItemProperties = null,
    referenceLayers: CollectionProperties[LayerProperties] = null,
    thumbnailUrl: java.lang.String = null,
    title: java.lang.String = null
  ): BasemapProperties = {
    val __obj = js.Dynamic.literal()
    if (baseLayers != null) __obj.updateDynamic("baseLayers")(baseLayers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (referenceLayers != null) __obj.updateDynamic("referenceLayers")(referenceLayers.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BasemapProperties]
  }
}

