package typings
package vueDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeforeMount extends js.Object {
  var beforeMount: js.Any
  var computed: Anon_TocLastLevelComputed
  var data: js.Any
  var md: Anon_Block
  var props: Anon_AnchorAttributes
  var render: js.Any
  var template: java.lang.String
}

object Anon_BeforeMount {
  @scala.inline
  def apply(
    beforeMount: js.Any,
    computed: Anon_TocLastLevelComputed,
    data: js.Any,
    md: Anon_Block,
    props: Anon_AnchorAttributes,
    render: js.Any,
    template: java.lang.String
  ): Anon_BeforeMount = {
    val __obj = js.Dynamic.literal(beforeMount = beforeMount, computed = computed, data = data, md = md, props = props, render = render, template = template)
  
    __obj.asInstanceOf[Anon_BeforeMount]
  }
}

