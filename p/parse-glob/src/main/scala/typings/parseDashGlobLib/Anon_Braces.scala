package typings
package parseDashGlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Braces extends js.Object {
  /**
    * True if it has braces ({1..2} or .{txt,md}).
    */
  var braces: scala.Boolean
  /**
    * True if it has POSIX brackets ([[:alpha:]]).
    */
  var brackets: scala.Boolean
  /**
    * True if the pattern should match dot-directories (like .git).
    */
  var dotdir: scala.Boolean
  /**
    * True if the pattern should match dotfiles.
    */
  var dotfile: scala.Boolean
  /**
    * True if it has extglobs (@(foo|bar)).
    */
  var extglob: scala.Boolean
  /**
    * True if the pattern actually is a glob pattern.
    */
  var glob: scala.Boolean
  /**
    * True if the pattern has a globstar (double star, **).
    */
  var globstar: scala.Boolean
  /**
    * True if it's a negation pattern (!/foo.js).
    */
  var negated: scala.Boolean
}

object Anon_Braces {
  @scala.inline
  def apply(
    braces: scala.Boolean,
    brackets: scala.Boolean,
    dotdir: scala.Boolean,
    dotfile: scala.Boolean,
    extglob: scala.Boolean,
    glob: scala.Boolean,
    globstar: scala.Boolean,
    negated: scala.Boolean
  ): Anon_Braces = {
    val __obj = js.Dynamic.literal(braces = braces, brackets = brackets, dotdir = dotdir, dotfile = dotfile, extglob = extglob, glob = glob, globstar = globstar, negated = negated)
  
    __obj.asInstanceOf[Anon_Braces]
  }
}

