package interfaceEx;


public class Stack extends Structure {

    @Override
    public void Push(Object value) {
        objectList.add(value);
    }

    @Override
    public Object Pop() {
        if (objectList.size() > 0) {
            Object result = objectList.get(objectList.size() - 1);
            objectList.remove(objectList.size() - 1);
            return result;
        } else {
            return null;
        }
    }
}
