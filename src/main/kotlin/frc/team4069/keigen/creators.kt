package frc.team4069.keigen

import org.ejml.simple.SimpleMatrix

object mat {
    operator fun <R : `100`, C : `100`> get(rows: Nat<R>, cols: Nat<C>, vararg data: Double): Matrix<R, C> {
        if (data.size != rows.i * cols.i) {
            throw IllegalArgumentException("Invalid matrix data provided. Wanted ${rows.i} x ${cols.i} matrix, but got ${data.size} elements")
        }

        val matData = data.toList().chunked(cols.i).map { it.toDoubleArray() }.toTypedArray()
        return Matrix(rows, cols, SimpleMatrix(matData))
    }

    operator fun <R : `100`, C : `100`> get(rows: Nat<R>, cols: Nat<C>, vararg data: Int): Matrix<R, C> {
        if (data.size != rows.i * cols.i) {
            throw IllegalArgumentException("Invalid matrix data provided. Wanted ${rows.i} x ${cols.i} matrix, but got ${data.size} elements")
        }

        val matData = data.toList().map { it.toDouble() }.chunked(cols.i).map { it.toDoubleArray() }.toTypedArray()
        return Matrix(rows, cols, SimpleMatrix(matData))
    }
}

object vec {
    operator fun <D : `100`> get(dim: Nat<D>, vararg data: Double): Vector<D> {
        if (data.size != dim.i) {
            throw IllegalArgumentException("Invalid number of elements for ${dim.i}-dimensional vector. got ${data.size} elements")
        }

        return Vector(dim, SimpleMatrix(dim.i, 1, false, data))
    }

    operator fun <D : `100`> get(dim: Nat<D>, vararg data: Int): Vector<D> {
        if (data.size != dim.i) {
            throw IllegalArgumentException("Invalid number of elements for ${dim.i}-dimensional vector. got ${data.size} elements")
        }

        return Vector(dim, SimpleMatrix(dim.i, 1, false, data.map { it.toDouble() }.toDoubleArray()))
    }
}


