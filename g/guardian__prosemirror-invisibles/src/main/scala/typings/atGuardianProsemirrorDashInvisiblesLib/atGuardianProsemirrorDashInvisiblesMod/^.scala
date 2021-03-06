package typings
package atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@guardian/prosemirror-invisibles", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def character(`type`: java.lang.String): js.Function1[/* predicate */ js.Function1[/* char */ java.lang.String, scala.Boolean], Builder] = js.native
  def createDeco(pos: scala.Double, `type`: java.lang.String): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def default(builders: js.Array[Builder]): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, _] = js.native
  def hardBreak(): Builder = js.native
  def hardBreak(
    predicate: js.Function1[/* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], scala.Boolean]
  ): Builder = js.native
  def node(
    `type`: java.lang.String,
    toPosition: js.Function2[
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], 
      /* pos */ scala.Double, 
      scala.Double
    ]
  ): js.Function1[
    /* predicate */ js.Function1[/* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], scala.Boolean], 
    Builder
  ] = js.native
  def paragraph(): Builder = js.native
  def paragraph(
    predicate: js.Function1[/* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], scala.Boolean]
  ): Builder = js.native
  def space(): Builder = js.native
  def space(predicate: js.Function1[/* char */ java.lang.String, scala.Boolean]): Builder = js.native
  def textBetween(from: scala.Double, to: scala.Double, doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_]): js.Array[TextBetweenPosition] = js.native
}

