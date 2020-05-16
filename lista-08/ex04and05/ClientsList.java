package ex04and05;

class ClientsList {
    static Client[] clients;

    static String[] clientsGenericNames = {
        "Eduardo", "Giullia", "Nicolas", "Murilo", "Cintia",
        "Lorena", "Andreia", "William", "Jorge", "Carlos", "Alberto",
        "Anna", "João"
    };

    static Client[] sortClientsInsertion(Client[] clients) {
        Client[] sortedClients = new Client[clients.length];

        for (byte i = 0; i < sortedClients.length; i++) {
            sortedClients[i] = clients[i];
        }

        Client stage;

        for (byte i = 1, j = 1; i < sortedClients.length; i++, j = i) {
            stage = sortedClients[j];

            while (j > 0 && sortedClients[j-1].id > stage.id) {
                sortedClients[j] = sortedClients[--j];
            }

            sortedClients[j] = stage;
        }        
        
        return sortedClients;
    }

    static Client[] sortClientsSelection(Client[] clients) {
        Client[] sortedClients = new Client[clients.length];

        for (byte i = 0; i < sortedClients.length; i++) {
            sortedClients[i] = clients[i];
        }

        Client lowest;
        Client stage;
        byte index;

        for (byte min = 0; min < sortedClients.length; min++) {
            lowest = sortedClients[min];
            index = -1;

            for (byte i = min; i < sortedClients.length; i++) {
                if (lowest.id > sortedClients[i].id) {
                    lowest = sortedClients[i];
                    index = i;
                }
            }

            if (index > -1) {
                stage = sortedClients[min];
                sortedClients[min] = sortedClients[index];
                sortedClients[index] = stage;                
            }
        }

        return sortedClients;     
    }

    static Client[] createClients(byte quant) {
        Client[] clients = new Client[quant];

        for (byte i = 0; i < quant; i++) {
            clients[i] = new Client(
                clientsGenericNames[(byte) (Math.random()*13)]
            );
        }

        return clients;
    }

    public static void main(String[] args) {
        Client[] clients = createClients((byte) 5);
        Client[] insertionSortedClients = sortClientsInsertion(clients);
        Client[] selectionSortedClients = sortClientsSelection(clients);

        System.out.println("Unsorted clients:\nID\tName\tSalary");
        for (Client client : clients) {
            System.out.format(
                "%d\t%s\tR$%.2f\n",
                client.id, client.name, client.salary
            );
        }

        System.out.println("\nSorted clients:\nID\tName\tSalary");
        for (Client client : insertionSortedClients) {
            System.out.format(
                "%d\t%s\tR$%.2f\n",
                client.id, client.name, client.salary
            );
        } 

        System.out.println("\nSorted clients:\nID\tName\tSalary");
        for (Client client : selectionSortedClients) {
            System.out.format(
                "%d\t%s\tR$%.2f\n",
                client.id, client.name, client.salary
            );
        }                
    }
}