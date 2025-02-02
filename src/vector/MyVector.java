package vector;

public class MyVector {
    private Object[] objArr;
    private int capacity;
    private int size;

    public MyVector() {
        this(16);
    }

    public MyVector(int capacity) {
        this.capacity = capacity;
        objArr = new Object[size];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // size == capacity capacity += 16
    // add를 할 때 마다 길이가 +1한 새로운 objArr 생성
    // 기존 objArr 값 새로운 objArr에 복사
    // 기존 objArr주소 새로운 objArr에 복사
    // 추가할 값 새로운 objArr에 넣기
    public void add(Object obj) {
        if (size == capacity)
            capacity += 16;

        Object[] newObjArr = new Object[++size];
        System.arraycopy(objArr, 0, newObjArr, 0, objArr.length);
        objArr = newObjArr;
        objArr[size - 1] = obj;
    }

    public Object get(int index) {
        return objArr[index];
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (objArr[i] == null)
                continue;
            else if (objArr[i].equals(obj))
                return i;
        }
        return -1;
    }

    // 1. remove할 obj의 위치를 찾는다.
        // 1.1 i가 -1이면 과정 수행하지 않고 false 반환
    // 2. 위치 + 1 값부터 끝까지를 위치로 옮긴다.
    public boolean remove(Object obj) {
        // 1. remove할 obj의 위치를 찾는다.
        int i = indexOf(obj);

        // 1.1 i가 -1이면 과정 수행하지 않고 false 반환
        if (i == -1)
            return false;

        // 2. 위치 + 1 값부터 끝까지를 위치로 옮긴다.
        System.arraycopy(objArr, i+1, objArr, i, size - i - 1);

        // 3. 맨 뒤 값을 삭제, size를 1 줄인다.
            // 3.1 --size한 새로운 objArr 생성
            // 3.2 새로운 objArr에 기존 objArr size만큼 복사
            // 3.3 objArr에 새로운 objArr 주소값 복사
        Object[] newObjArr = new Object[--size];
        System.arraycopy(objArr, 0, newObjArr, 0, size);
        objArr = newObjArr;

        return true;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        for (Object o : objArr) {
            str.append(o).append(" ");
        }

        return new String(str);
    }
}
