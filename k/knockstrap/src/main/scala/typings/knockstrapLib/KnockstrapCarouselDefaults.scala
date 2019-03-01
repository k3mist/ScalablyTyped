package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaults extends js.Object {
  var controlsTemplate: KnockstrapCarouselDefaultsControlsTemplate
  var css: java.lang.String
  var indicatorsTemplate: KnockstrapCarouselDefaultsIndicatorsTemplate
  var itemTemplate: KnockstrapCarouselDefaultsItemTemplate
}

object KnockstrapCarouselDefaults {
  @scala.inline
  def apply(
    controlsTemplate: KnockstrapCarouselDefaultsControlsTemplate,
    css: java.lang.String,
    indicatorsTemplate: KnockstrapCarouselDefaultsIndicatorsTemplate,
    itemTemplate: KnockstrapCarouselDefaultsItemTemplate
  ): KnockstrapCarouselDefaults = {
    val __obj = js.Dynamic.literal(controlsTemplate = controlsTemplate, css = css, indicatorsTemplate = indicatorsTemplate, itemTemplate = itemTemplate)
  
    __obj.asInstanceOf[KnockstrapCarouselDefaults]
  }
}

