/*
    This file is part of jLens.

    jLens is free software: you can redistribute it and/or modify it under the
    terms of the GNU Lesser General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    jLens is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
    FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
    more details.

    You should have received a copy of the GNU Lesser General Public License
    along with jLens.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.cvut.felk.cyber.jlens;

/**
 * A wrapper for constructing {@link Getter getters} (read-only lenses) that
 * are based on another {@link Getter}. A typical example is
 * {@link Lenses.JoinGetter}.
 */
public abstract class WrappedGetter<T,R,G extends Getter<T,?>>
    extends AbstractGetter<T,R>
{
    protected final G getter;

    protected WrappedGetter(G getter, Class<R> recordClass) {
        super(getter.recordClass(), recordClass);
        this.getter = getter;
    }
}
