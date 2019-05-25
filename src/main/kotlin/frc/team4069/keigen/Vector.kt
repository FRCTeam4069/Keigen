package frc.team4069.keigen

import org.ejml.simple.SimpleMatrix

class Vector<D: `100`>(dim: Nat<D>, storage: SimpleMatrix) : Matrix<D, `1`>(dim, `1`, storage) {
    operator fun get(i: Int) = storage[i, 0]
    operator fun set(i: Int, j: Double) {
        storage[i, 0] = j
    }
}
